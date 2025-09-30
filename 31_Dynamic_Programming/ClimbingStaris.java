public class ClimbingStaris {

    // ? Recusrsion
    public static int countWays(int n){
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        return countWays(n-1) + countWays(n-2);
    }

    // ? Recursion and Memoization
    public static int countWays(int n, int[] ways){
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }
        if(ways[n]!= 0){
            return ways[n];
        }
        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }

    public static int countWaysTab(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        //? Recursion
        System.out.println("Number of ways to climb " + n + " stairs: " + countWays(n));
        // ? Recusrsion+Memoization
        int[] ways = new int[n+1];
        System.out.println("Number of ways to climb " + n + " stairs: " + countWays(n, ways));
        //? Tabulation
        System.out.println("Number of ways to climb " + n + " stairs: " + countWaysTab(n));
    }
}
