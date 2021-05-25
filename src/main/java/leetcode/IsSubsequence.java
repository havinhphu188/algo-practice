package leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int indexS = 0; int indexT = 0;
        while ((indexT < t.length())&&(indexS < s.length())){
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
            }
            indexT++;
        }
        if (indexS == s.length()) {
            return true;
        }
        return false;
    }
}
