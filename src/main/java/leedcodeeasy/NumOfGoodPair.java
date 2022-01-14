package leedcodeeasy;

import java.util.Arrays;
//https://leetcode.com/problems/number-of-good-pairs/
//1512. Number of Good Pairs
public class NumOfGoodPair {
    public int numIdenticalPairs(int[] A) {
        int res = 0, count[] = new int[101];
        for (int a: A) {
            res += count[a]++;
        }
        return res;
    }
}
