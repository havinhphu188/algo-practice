package dynamicprogramming;

//https://www.geeksforgeeks.org/problems/rod-cutting0840/1
class RodCutting{
    public int cutRod(int price[], int n) {
        int[][] dp = new int[price.length + 1][n + 1];
        for (int i = 1; i < price.length + 1; i++){
            for (int j = 1; j < n + 1; j++){
                if (j >= i ){
                    dp[i][j] = Math.max(dp[i][j - (i)] + price[i - 1], dp[i - 1][j]);
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[price.length][n];
    }

    public static void main(String[] args) {
        RodCutting sol = new RodCutting();
        int res = sol.cutRod(new int[]{3, 5, 8, 9, 10, 17, 17, 20}, 8);
        System.out.println(res);
    }
}