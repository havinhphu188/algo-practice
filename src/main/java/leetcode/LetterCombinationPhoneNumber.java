package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//17. Letter Combinations of a Phone Number
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class LetterCombinationPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        char[] arrChar = digits.toCharArray();
        Map<Character, List<Character>> mapNumberChar = new HashMap<>();
        List<Character> char2 = new ArrayList<>();
        char2.add('a'); char2.add('b'); char2.add('c');
        List<Character> char3 = new ArrayList<>();
        char3.add('d'); char3.add('e'); char3.add('f');
        List<Character> char4 = new ArrayList<>();
        char4.add('g'); char4.add('h'); char4.add('i');
        List<Character> char5 = new ArrayList<>();
        char5.add('j'); char5.add('k'); char5.add('l');
        List<Character> char6 = new ArrayList<>();
        char6.add('m'); char6.add('n'); char6.add('o');
        List<Character> char7 = new ArrayList<>();
        char7.add('p'); char7.add('q'); char7.add('r');
        char7.add('s');
        List<Character> char8 = new ArrayList<>();
        char8.add('t'); char8.add('u'); char8.add('v');
        List<Character> char9 = new ArrayList<>();
        char9.add('w'); char9.add('x'); char9.add('y');
        char9.add('z');
        mapNumberChar.put('2', char2);
        mapNumberChar.put('3', char3);
        mapNumberChar.put('4', char4);
        mapNumberChar.put('5', char5);
        mapNumberChar.put('6', char6);
        mapNumberChar.put('7', char7);
        mapNumberChar.put('8', char8);
        mapNumberChar.put('9', char9);
        List<Character> temp = new ArrayList<>();
        backTracking(result, temp,mapNumberChar, arrChar, 0);
        System.out.println("result = " + result);
        return result;
    }

    private void backTracking(List<String> result, List<Character> temp, Map<Character, List<Character>> mapNumberChar, char[] arrChar, int currentIndex) {
        if (currentIndex == arrChar.length){
            String string =  temp.stream().map(String::valueOf).collect(Collectors.joining());
            result.add(string);
            return;
        }
        System.out.println("currentIndex = " + currentIndex);
        for (Character c: mapNumberChar.get(arrChar[currentIndex])){
            temp.add(c);
            backTracking(result, temp, mapNumberChar, arrChar, currentIndex + 1);
            temp.remove(temp.size() - 1);
        }
    }

}
