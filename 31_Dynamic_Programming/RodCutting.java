public class RodCutting {
    public static int maxPrice(int[] prices, int[] length, int rodLength) {
        int[][] dp = new int[prices.length+1][rodLength+1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(length[i-1] <= j){
                    dp[i][j] = Math.max(prices[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[prices.length][rodLength];
    }
    public static void main(String[] args) {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
        int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
        int rodLength = 8;
        System.out.println("Maximum price that can be obtained: " + maxPrice(prices, length, rodLength));
    }
}
