package leetcode;

import com.google.gson.Gson;

import java.util.HashMap;
//https://leetcode.com/problems/permutation-in-string/
//567. Permutation in String
// Slide window Solution: https://leetcode.com/problems/permutation-in-string/solution/

public class PermutationInString {
//    Gson gson = new Gson();
    public boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length()) return false;
        HashMap<Character, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i),0) + 1);
        }

        HashMap<Character, Integer> s2Map = new HashMap<>();
        for (Character key : s1Map.keySet()) {
            s2Map.put(key, 0);
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1Map.containsKey(s2.charAt(i))){
                s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i),0) + 1);
            }
        }

        int count = 0;
        for (Character c: s1Map.keySet()) {
            if (s1Map.get(c).equals(s2Map.getOrDefault(c, 0))){
                count++;
            }
        }

        if (count == s1Map.size()) return true;
//        System.out.println("s1Map = " + gson.toJson(s1Map));
//        System.out.println("s2Map = " + gson.toJson(s2Map));
        System.out.println("count = " + count);


        for (int i = 1; i < s2.length()-s1.length() + 1; i++) {
            System.out.println("----- i: " + i);
            char left = s2.charAt(i - 1);
            char right = s2.charAt(i + s1.length() - 1);
            if (s1Map.containsKey(left)){
                s2Map.put(left, s2Map.get(left) - 1);
                if (s2Map.get(left).equals(s1Map.get(left))){
                    System.out.println("left = " + left);
                    count++;
                } else if (s2Map.get(left) + 1 == s1Map.get(left)) {
                    System.out.println("left = " + left);
                    count--;
                }
            }

            if (s1Map.containsKey(right)){
                s2Map.put(right, s2Map.getOrDefault(right,0) + 1);
                if (s2Map.get(right).equals(s1Map.get(right))){
                    System.out.println("right = " + right);
                    count++;
                }
                else if (s2Map.get(right) - 1 == s1Map.get(right)) {
                    System.out.println("right = " + right);
                    count--;
                }
            }
//            System.out.println("s2Map = " + gson.toJson(s2Map));
            System.out.println("count = " + count);

            if (count == s1Map.size()) return true;
        }

        return false;
    }
}
