package leetcode;
//Solution
//https://leetcode.com/problems/longest-repeating-character-replacement/discuss/91271/Java-12-lines-O(n)-sliding-window-solution-with-explanation/95833
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int start = 0; int end; int maxLength = 0;
        for (end = 0; end < s.length(); end++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(end)-'A']);
            while(end-start + 1 > k + maxCount){
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
