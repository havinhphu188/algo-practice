package leetcode;

import java.util.Arrays;

public class MaximumCoin {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int index = piles.length - 2;
        int sum = 0;
        for (int i = 0; i < piles.length/3; i++) {
            sum += piles[index];
            index -=2;
        }
        return sum;
    }
}
