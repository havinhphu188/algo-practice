package leetcode;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
//        System.out.println("nums = " + Arrays.toString(nums));
//        System.out.println("nums.length = " + nums.length);
        int res = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum < k && r < nums.length - 1) {
                r++;
                sum += nums[r];
            }
            System.out.println("r = " + r);
            System.out.println("sum = " + sum);

            while(sum > k && l < nums.length - 1){
                sum -= nums[l];
                l++;
            }
            System.out.println("l = " + l);
            System.out.println("sum = " + sum);

            if (sum == k) {
                res++;
            }
            System.out.println("l = " + l);
            System.out.println("r = " + r);
            System.out.println("----");
            r++;
        }
        return res;
    }
}
