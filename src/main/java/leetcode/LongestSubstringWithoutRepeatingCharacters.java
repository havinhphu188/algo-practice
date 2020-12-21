package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> count = new HashSet<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (count.contains(c)) {
                for( ; s.charAt(left) != c; left++){
                    count.remove(s.charAt(left));
                }
                left++;
            }
            else{
                count.add(c);
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
