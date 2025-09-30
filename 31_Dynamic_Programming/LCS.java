public class LCS {
    public static int lcs(String str1, String str2, int m, int n){
        if(m == 0 || n == 0){
            return 0;
        }
        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return 1 + lcs(str1, str2, m-1, n-1);
        }
        return Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1));
    }

    public static int lcs2(String str1, String str2, int m, int n, int[][] dp) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return dp[m][n] = 1 + lcs(str1, str2, m - 1, n - 1);
        }
        return  dp[m][n] = Math.max(lcs(str1, str2, m - 1, n), lcs(str1, str2, m, n - 1));
    }
    public static int lcs3(String str1, String str2){
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i = 1; i <= str1.length(); i++){
            for(int j = 1; j <= str2.length(); j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        System.out.println(lcs(str1, str2, str1.length(), str2.length()));

        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lcs2(str1, str2, str1.length(), str2.length(), dp));
        System.out.println(lcs3(str1, str2));
    }
}
