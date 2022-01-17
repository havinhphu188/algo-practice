package leetcode2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode4Test {

    @Test
    public void testCase1() {
        Leetcode4 sol = new Leetcode4();
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        assertEquals(2, sol.findMedianSortedArrays(nums1, nums2));

    }

    @Test
    public void testCase2() {
        Leetcode4 sol = new Leetcode4();
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        assertEquals(2.5, sol.findMedianSortedArrays(nums1, nums2));

    }
}