public class Fibbonacci {
    // ? Memoization
    public static int fibonacci(int n, int[] dp) {
        if(n <= 1){
            return n;
        }
        if(dp[n]!= 0){
            return dp[n];
        }
        dp[n] = fibonacci(n-1, dp)+ fibonacci(n-2, dp);
        return dp[n];
    }

    // ? Tabulation
    public static int fibonacci(int n) {
       int[] dp = new int[n+1];
       dp[1] = 1;
       for(int i=2; i<dp.length; i++){
            dp[i] = dp[i-1]+dp[i-2];
       }
        return dp[n];
    }
    public static void main(String[] args){
        int n = 6;
        // int[] dp = new int[n+1];
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
    }
}