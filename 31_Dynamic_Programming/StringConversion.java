public class StringConversion {
    public static void operationOfInsAndDel(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int del = s1.length() - dp[m][n];
        int ins = s2.length() - dp[m][n];
        System.out.println("Number of insertions: " + ins);
        System.out.println("Number of deletions: " + del);
    }
    public static void main(String[] args) {
        String s1 = "pear";
        String s2 = "sea";
        operationOfInsAndDel(s1, s2);
    }
}
