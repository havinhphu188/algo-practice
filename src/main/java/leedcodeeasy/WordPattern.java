package leedcodeeasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
//        System.out.println("pattern = " + pattern);
//        System.out.println("s = " + s)
        String[] sArr = s.split(" ");
        if (pattern.length() != sArr.length) {
            return false;
        }
        String[] mapP2S = new String[26];
        Map<String, Character> mapS2P = new HashMap<>();
        char[] patternArr = pattern.toCharArray();
//        System.out.println("patternArr = " + Arrays.toString(patternArr));
        for (int i = 0; i < patternArr.length; i++) {
            if ((mapP2S[patternArr[i] - 'a'] != null)&&(!mapP2S[patternArr[i] - 'a'].equals(sArr[i]))) return false;
            if ((mapS2P.containsKey(sArr[i])) &&(mapS2P.get(sArr[i]) != patternArr[i])) return false;
            mapP2S[patternArr[i] - 'a'] = sArr[i];
            mapS2P.put(sArr[i], patternArr[i]);

        }
//        System.out.println("mapP2S = " + Arrays.toString(mapP2S));
        return true;
    }
}
