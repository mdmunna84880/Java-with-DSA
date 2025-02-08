public class GridWays {
    public static int countGrid(int m, int n, int i, int j){
        if(i == m-1 && j == n-1){
            return 1;
        }else if(i == m || j == n){
            return 0;
        }
        return countGrid(m, n, i+1, j) + countGrid(m, n, i, j+1);
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(countGrid(m, n, 0, 0));
    }
}
