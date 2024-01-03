package dynamicprogramming;

public class KnapSack01 {
    static int knapSack(int W, int wt[], int val[], int n) {
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i < wt.length; i++) { // items
            for (int j = 0; j <= W; j++) { //main info
                if (j >= wt[i]) {
                    dp[i + 1][j] = Math.max(dp[i][j - wt[i]] + val[i], dp[i][j]);
                } else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int res = knapSack(5, new int[]{1,3,4}, new int[]{2,4,3}, 3);
        System.out.println(res);
    }
}
