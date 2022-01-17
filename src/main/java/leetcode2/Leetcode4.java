package leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/median-of-two-sorted-arrays/
//4. Median of Two Sorted Arrays

public class Leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        double res;
        while ((i < nums1.length) && (j < nums2.length)) {
            if (nums1[i] <= nums2[j]) {
                merged.add(nums1[i]);
                i++;
            }else{
                merged.add(nums2[j]);
                j++;
            }
        }
        while (i < nums1.length) {
            merged.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            merged.add(nums2[j]);
            j++;
        }
        if (merged.size() % 2 == 0){
            res = (merged.get(merged.size()/2) + merged.get((merged.size() - 1)/2))/(double)2;
        }else{
            res = (merged.get((merged.size() - 1)/2));
        }

        return res;
    }
}
