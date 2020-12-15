import javax.lang.model.SourceVersion;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;


        Map<Character, Integer> sCharCount = charStatistic(s);
        Map<Character, Integer> tCharCount = charStatistic(t);


        for (Map.Entry<Character, Integer> entry : sCharCount.entrySet()) {
//            System.out.println("tCharCount.get(entry.getKey()) = " + tCharCount.get(entry.getKey()));
//            System.out.println("entry.getValue() = " + entry.getValue());
            Integer numberOfCharInT = tCharCount.get(entry.getKey());
            if (numberOfCharInT == null) return false;
            if (!tCharCount.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }

        return true;
    }

    private Map<Character, Integer> charStatistic(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar)) {
                int charCount = map.get(currentChar);
                map.put(currentChar, charCount + 1);
            } else {
                map.put(currentChar, 1);
            }
        }

        return map;
    }
}
