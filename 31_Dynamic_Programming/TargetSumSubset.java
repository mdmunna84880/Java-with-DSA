public class TargetSumSubset {
    public static void print(boolean[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isTargetSumAvailable(int[] arr, int targetSum){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][targetSum+1];
        for(int i = 0; i < n+1; i++){
            dp[i][0] = true;
        }
        for(int i = 1; i < n+1; i++){
            int val = arr[i-1];
            for(int j = 1; j < targetSum+1; j++){
                if(val <= j && dp[i-1][j-val] == true){
                    dp[i][j] = true;
                }else if(dp[i-1][j]== true){
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[n][targetSum];
    }
    public static void main(String[] args) {
        int numbers[] = {4, 2, 7, 1, 3};
        int targetSum = 10;
        System.out.println(isTargetSumAvailable(numbers, targetSum));
    }
}
