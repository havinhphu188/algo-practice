package leetcode;
//https://leetcode.com/problems/shortest-subarray-to-be-removed-to-make-array-sorted/
//1574. Shortest Subarray to be Removed to Make Array Sorted
public class Leetcode1574 {
    public int findLengthOfShortestSubarray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < arr.length - 1 && arr[left + 1] >= arr[left]){
            left++;
        }
        if (left == arr.length - 1) return 0;
        while (arr[right - 1] <= arr[right]){
            right--;
        }

        int result = Math.min(arr.length - left - 1, right);

        int i = 0, j = right;

        while(i <= left && j <= arr.length - 1){
            if (arr[j] >= arr [i]){
                result = Math.min(result, j - i - 1);
                i++;
            }else{
                j++;
            }
        }
        return result;
    }
}
