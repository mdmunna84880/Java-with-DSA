public class UnboundedKnapsack {
    public static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int getMaximumProfit(int[] val, int[] wt, int W){
        int[][] dp = new int[val.length+1][W+1];
        for(int i = 1; i <= val.length; i++){
            for(int j = 1; j <= W; j++){
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[val.length][W];
    }
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(getMaximumProfit(val, wt, W));
    }   
}
