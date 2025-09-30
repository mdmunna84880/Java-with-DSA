public class MinimumParticining {
    public static int minPartition(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        
        int halfSum = sum /2;
        int dp[][] = new int[nums.length+1][halfSum+1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(nums[i-1] <= j){
                    dp[i][j] = Math.max(nums[i-1]+dp[i-1][j-nums[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[nums.length][halfSum];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        int[] nums = {1, 6, 11, 5};
        System.out.println(minPartition(nums));
    }
}
