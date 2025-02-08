public class OptimizedGridWays {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static int gridWays(int m, int n){
        int totalWays = fact(n+m-2)/(fact(n-1)*fact(m-1));
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(gridWays(m, n));
    }
}
