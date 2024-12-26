public class BinoCoefficient {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 2; i <=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int binoCoeff(int n, int r){
        int factn = factorial(n);
        int factr = factorial(r);
        int factnmr = factorial(n-r);
        int binoCoeff = factn / (factr * factnmr);
        return binoCoeff;
    }
    public static void main(String[] args) {
        System.out.println(binoCoeff(5, 2));
    }
}
