public class TillingProblem {
    public static int tillingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = tillingProblem(n-1);
        int fnm2 = tillingProblem(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tillingProblem(n));
    }
}
