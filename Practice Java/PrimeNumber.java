public class PrimeNumber {
    public static void main(String[] args) {
        int n = 9;
        boolean isPrime = true;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);
    }
}
