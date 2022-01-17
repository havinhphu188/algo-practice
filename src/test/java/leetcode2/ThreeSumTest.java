package leetcode2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    public void testCase1() {
        ThreeSum sol = new ThreeSum();
        List<List<Integer>> res = new LinkedList<>();
        res.add(Arrays.asList(-1,-1,2));
        res.add(Arrays.asList(-1,0,1));
        assertEquals(res, sol.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test
    public void testCase2() {
        ThreeSum sol = new ThreeSum();
        List<List<Integer>> res = new LinkedList<>();

        assertEquals(res, sol.threeSum(new int[]{}));
    }

    @Test
    public void testCase3() {
        ThreeSum sol = new ThreeSum();
        List<List<Integer>> res = new LinkedList<>();
        assertEquals(res, sol.threeSum(new int[]{0}));
    }

    @Test
    public void testCase4() {
        ThreeSum sol = new ThreeSum();
        List<List<Integer>> res = new LinkedList<>();
        res.add(Arrays.asList(-2,0,2));
        res.add(Arrays.asList(-2,1,1));
        assertEquals(res, sol.threeSum(new int[]{1,1,1,2,2,2,0,-2}));
    }
}