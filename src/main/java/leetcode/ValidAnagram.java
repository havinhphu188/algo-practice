package leetcode;
import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] sortedS = s.toCharArray();
        Arrays.sort(sortedS);

        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedT);

        return Arrays.equals(sortedS,sortedT);
    }
}
