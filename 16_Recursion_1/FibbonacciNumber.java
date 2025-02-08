public class FibbonacciNumber {
    public static int fibbonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        int fibN1 = fibbonacci(n-1);
        int fibN2 = fibbonacci(n-2);
        return fibN1+fibN2;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibbonacci(n));
    }
}
