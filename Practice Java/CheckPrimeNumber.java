public class CheckPrimeNumber {

    // ? Time complexity is O(sqrt(n));
    public static boolean isPrime(int n){
        // ? Less than and equal to 1 is not a prime number
        if(n <= 1){
            return false;
        }

        // ? Any other factors of itself then it becomes the composite number
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        // ? Otherwise prime number
        return true;
    }
    public static void main(String[] args) {
        int number = 20;
        if(isPrime(number)){
            System.out.println("The given number is a prime number");
        }else{
            System.out.println("The given number is not a prime number");
        }
    }    
}