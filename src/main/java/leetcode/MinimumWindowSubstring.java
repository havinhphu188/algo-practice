package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/minimum-window-substring/
//76. Minimum Window Substring
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        Map<Character, Integer> dicT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            dicT.put(c, dicT.getOrDefault(c, 0) + 1);
        }

        int required = dicT.size();
        int r = 0;
        int l = 0;
        int formed = 0;
        int[] ans = new int[]{-1,0,0};
        while (r < s.length()) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c,0)+1);
            if (window.get(c).intValue() == dicT.getOrDefault(c,0).intValue()){
                formed++;
            }

            while (formed == required){
                if (ans[0]==-1||(ans[0] > r - l +1)){
                    ans[0] = r - l +1;
                    ans[1] = l;
                    ans[2] = r;
                }

                char removedC = s.charAt(l);
                if (window.get(removedC).intValue() == dicT.getOrDefault(removedC,0).intValue()){
                    formed--;
                }
                window.put(removedC, window.get(removedC)-1);
                l++;
            }
            r++;
        }

        return ans[0]== -1 ? "":s.substring(ans[1],ans[2]+1);
    }

}
