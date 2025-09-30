public class LongestCommonSubstring {
    public static int longCommonSubstring(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int maxLen = 0;
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }
        return maxLen;    
    }
    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";
        System.out.println("Length of longest common substring is: " + longCommonSubstring(str1, str2));
    }
}
