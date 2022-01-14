package leedcodeeasy;

import java.util.Set;
import java.util.stream.Collectors;
//https://leetcode.com/problems/jewels-and-stones/
//771. Jewels and Stones

public class JewelsAndStone {
    public int numJewelsInStones(String jewels, String stones) {
//        System.out.println("jewels = " + jewels);
//        System.out.println("stones = " + stones);
        Set<Character> jewelsArr = jewels.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        int counter = 0;
        for (char c : stones.toCharArray()) {
            if (jewelsArr.contains(c)){
                counter++;
            }
        }
        return counter;
    }
}
