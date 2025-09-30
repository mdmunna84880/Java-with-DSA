public class EditDistance {
    public static int editDist(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0){
                    dp[i][j] = j;
                }
                if(j == 0){
                    dp[i][j] = i;
                }
            }
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int add = dp[i][j-1];
                    int del = dp[i-1][j];
                    int rep = dp[i-1][j-1];
                    dp[i][j] = Math.min(Math.min(add, del), rep) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println("Minimum number of edits: " + editDist(word1, word2));
    }
}
