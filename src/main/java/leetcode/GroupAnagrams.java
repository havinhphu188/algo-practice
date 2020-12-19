package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anaGroup = new HashMap<>();
        for (String str : strs) {
            char[] sortedS = str.toCharArray();
            Arrays.sort(sortedS);
            String key = String.valueOf(sortedS);
            if (anaGroup.get(key) == null) {
                anaGroup.put(key, new ArrayList<>());
            }
            anaGroup.get(key).add(str);
        }

        List<List<String>> result = anaGroup.values().stream().collect(Collectors.toList());
        return result;
    }
}
