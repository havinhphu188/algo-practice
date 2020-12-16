package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {
    @Test
    public void testCase1() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] input = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] output = new int[][]{{1,6},{8,10},{15,18}};
        assertArrayEquals(output, mergeIntervals.merge(input));
    }

    @Test
    public void testCase2() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] input = new int[][]{{1,4},{0,4}};
        int[][] output = new int[][]{{0,4}};
        assertArrayEquals(output, mergeIntervals.merge(input));
    }

}