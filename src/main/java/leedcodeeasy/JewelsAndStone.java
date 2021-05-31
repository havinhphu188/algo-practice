package leedcodeeasy;

import java.util.Set;
import java.util.stream.Collectors;

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
