package leetcode;

public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int l = 0;
        int r;
        int count = s.length();
        while (l < s.length() - 1) {
            r = l + 1;
            count = getCount(s, l, r, count);
            if (l + 2 < s.length()){
                r = l + 2;
                count = getCount(s, l, r, count);
            }
            l++;
        }

        return count;
    }

    private int getCount(String s, int l, int r, int count) {
        int i = l;
        int j = r;
        while ((i >= 0)&&(j< s.length())&&(s.charAt(i)==s.charAt(j))){
            count++;
            i--;
            j++;
        }
        return count;
    }
}
