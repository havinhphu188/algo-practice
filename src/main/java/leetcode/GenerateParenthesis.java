package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        System.out.println("n = " + n);
        List<String> result = new ArrayList<>();
        List<Character> temp = new ArrayList<>();
        backTracking(temp, n,0, n*2, result);
        System.out.println("result = " + result);
        return result;
    }

    public void backTracking(List<Character> temp, int numOfOpenP, int track,int targetLength, List<String> result) {
        if (temp.size() == targetLength) {
            String parenthesis =  temp.stream().map(String::valueOf).collect(Collectors.joining());
            result.add(parenthesis);
        }
        if ((numOfOpenP > 0)){
            temp.add('(');
            backTracking(temp,numOfOpenP-1, track + 1, targetLength, result);
            temp.remove(temp.size()-1);
        }
        if (track > 0){
            temp.add(')');
            backTracking(temp, numOfOpenP, track - 1, targetLength, result);
            temp.remove(temp.size()-1);
        }
    }
}
