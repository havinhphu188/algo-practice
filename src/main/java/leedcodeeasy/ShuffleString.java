package leedcodeeasy;

import java.util.Arrays;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] map = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            map[indices[i]] = s.charAt(i);
        }
        return new String(map);
    }
}
