public class CountBST {
    public static int countBST(int n){
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < i; j++){
                int leftBST = dp[j];
                int rightBST = dp[i-j-1];
                dp[i] += leftBST * rightBST;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of BSTs with " + n + " nodes is: " + countBST(n));
    }
}
