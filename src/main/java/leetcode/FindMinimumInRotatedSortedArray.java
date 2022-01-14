package leetcode;
//153. Find Minimum in Rotated Sorted Array
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length-1]) return nums[0];

        int l = 0;
        int r = nums.length - 1;
        System.out.println("r = " + r);
        System.out.println("l = " + l);

        while (l < r - 1) {
            System.out.println("r-1 = " + (r - 1));
            System.out.println("l = " + l);
            System.out.println("r = " + r);
            int m = (r + l + 1) / 2;
            System.out.println("m = " + m);
            if (nums[m] > nums[r]) {
                l = m;
            } else {
                r = m;
            }
        }
        return nums[r];
    }
}
