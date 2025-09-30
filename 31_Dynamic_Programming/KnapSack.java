import java.util.Arrays;

public class KnapSack {

    // ? Time Complexity-O(2^n)
    public static int knapSack(int[] w, int[] v, int n, int W){
        if(W == 0 || n == 0){
            return 0;
        }
        if(W >= w[n-1]){
            int ans1 = v[n-1] + knapSack(w, v, n-1, W-w[n-1]);
            int ans2 = knapSack(w, v, n-1, W);
            return Math.max(ans1, ans2);
        }else{
            return knapSack(w, v, n-1, W);
        }
    }

    // ? Time Complexity- O(N*W)
    public static int knapSack(int[] w, int[] v, int n, int W, int[][] dp) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if (W >= w[n - 1]) {
            int ans1 = v[n - 1] + knapSack(w, v, n - 1, W - w[n - 1]);
            int ans2 = knapSack(w, v, n - 1, W);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = knapSack(w, v, n - 1, W);
            return dp[n][W];
        }
    }
    public static void print(int dp[][]){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    // ? Tabulation 
    public static int knapSack(int[] wt, int[] val, int W) {
        int[][] dp = new int[val.length+1][W+1];
        
        for(int i = 1; i < dp.length; i++){
            int v = val[i-1];
            int w = wt[i-1];
            for(int j = 1; j < dp[0].length; j++){
                if(w <= j){
                    int included = v + dp[i-1][j-w];
                    int exluded = dp[i-1][j];
                    dp[i][j] = Math.max(included, exluded);
                }else{
                    int exluded = dp[i - 1][j];
                    dp[i][j] = exluded;
                }
            }
        }
        print(dp);
        return dp[val.length][W];
    }
    public static void main(String[] args) {
        int[] w = {2, 5, 1, 3, 4};
        int[] v = {15, 14, 10, 45, 30};
        int W = 7;
        int n = v.length;
        System.out.println("Maximum value that can be obtained: " + knapSack(w, v, n, W));
        int[][] dp = new int[n+1][W+1];
        for(int i = 0; i < n+1; i++){
            Arrays.fill(dp[i], -1);
        }
        // ? Memoization algorithm
        System.out.println("Maximum value that can be obtained: " + knapSack(w, v, n, W, dp));
        // ? Tabulation algorithm
        System.out.println("Maximum value that can be obtained: " + knapSack(w, v, W));
    }
}
