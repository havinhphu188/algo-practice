package leetcode;

import java.util.Arrays;

//Jump Game II
//https://leetcode.com/problems/jump-game-ii
// Good solution: https://leetcode.com/problems/jump-game-ii/discuss/18014/Concise-O(n)-one-loop-JAVA-solution-based-on-Greedy
public class JumpGame2 {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int furthestPoint = nums[0];
        int jump = 1;
        int currentEnd = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (i > currentEnd){
                jump++;
                currentEnd = furthestPoint;
            }
            furthestPoint = Math.max(furthestPoint, nums[i] + i);
        }
        return jump;
    }
}
