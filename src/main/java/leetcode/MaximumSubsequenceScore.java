package leetcode;

import com.google.gson.Gson;

import java.util.*;

//https://leetcode.com/problems/maximum-subsequence-score/
//solution: https://leetcode.com/problems/maximum-subsequence-score/solutions/3895395/simple-java-solution-with-comments/

class Pair {
    public int num1, num2;

    public Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class MaximumSubsequenceScore {
    static Gson gson = new Gson();

    public long maxScore(int[] nums1, int[] nums2, int k) {
        List<Pair> input = new ArrayList<Pair>();
        for (int i = 0; i < nums1.length; i++) {
            input.add(new Pair(nums1[i], nums2[i]));
        }

        input.sort((o1, o2) -> Integer.compare(o2.num1, o1.num1));

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((o1, o2) -> Integer.compare(o1.num2, o2.num2));
        long sum = 0;
        for (int i = 0; i < k; i++) {
            pq.add(input.get(i));
            sum += input.get(i).num1;
        }
        long maxScore = sum * pq.peek().num2;
        for (int i = k; i < nums1.length; i++) {
            if (input.get(i).num2 > pq.peek().num2) {
                sum -= pq.remove().num1;

                int min = input.get(i).num2;
                if (!pq.isEmpty()) {
                    min = Math.min(min, pq.peek().num2);
                }
                sum += input.get(i).num1;
                long currentScore = sum * min;
                maxScore = Math.max(maxScore, currentScore);
                pq.add(input.get(i));
            }
        }
        return maxScore;
    }

    public static void main(String[] args) {
        MaximumSubsequenceScore solution = new MaximumSubsequenceScore();
        long out = solution.maxScore(new int[]{4,2,3,1,1}, new int[]{7,5,10,9,6}, 1);
        System.out.println(out);
    }
}
