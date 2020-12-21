package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> count = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (count.get(c) == null){
                count.put(c,0);
            }

            if (count.get(c) == 1) {
                for( ; s.charAt(left) != c; left++){
                    count.put(s.charAt(left),0);
                }
                left++;
            }
            else{
                count.put(c,1);
            }

            System.out.println("left = " + left);
            System.out.println("right = " + right);
            System.out.println(System.getProperty("line.separator"));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
