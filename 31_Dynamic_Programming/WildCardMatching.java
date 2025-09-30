public class WildCardMatching {
    public static boolean isWild(String s, String p){
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        // ? Initiallization
        dp[0][0] = true;
        for(int i = 1; i < s.length()+1; i++){
            dp[i][0] = false;
        }

        for(int j = 1; j < p.length()+1; j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }
        return dp[s.length()][p.length()];
    }
    public static void main(String[] args) {
        String s = "";
        String p = "****";
        System.out.println(isWild(s, p)); // true
    }
}
