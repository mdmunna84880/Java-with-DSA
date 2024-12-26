public class Factorial {
    public static int fact(int n){
        int f = 1;
        for(int i = 2; i <= n; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
