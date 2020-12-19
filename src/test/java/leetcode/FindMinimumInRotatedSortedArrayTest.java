package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {
    @Test
    public void testCase1() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] input = new int[]{3,4,5,1,2};
        int output = 1;
        assertEquals(output, findMinimumInRotatedSortedArray.findMin(input));
    }

    @Test
    public void testCase2() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] input = new int[]{9,10,5,6,7,8};
        int output = 5;
        assertEquals(output, findMinimumInRotatedSortedArray.findMin(input));
    }

    @Test
    public void testCase3() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] input = new int[]{20,7,8,10,12,13};
        int output = 7;
        assertEquals(output, findMinimumInRotatedSortedArray.findMin(input));
    }

    @Test
    public void testCase4() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] input = new int[]{10,12,13,20,7,8};
        int output = 7;
        assertEquals(output, findMinimumInRotatedSortedArray.findMin(input));
    }

    @Test
    public void testCase5() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] input = new int[]{8,10,12,13,20,7};
        int output = 7;
        assertEquals(output, findMinimumInRotatedSortedArray.findMin(input));
    }

    @Test
    public void testCase6() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        int[] input = new int[]{7,8,10,12,13,20};
        int output = 7;
        assertEquals(output, findMinimumInRotatedSortedArray.findMin(input));
    }

}