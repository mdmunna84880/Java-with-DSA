
import java.util.Scanner;

public class CheckingPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number == 2) {
            isPrime = true;
        } else if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime == true) {
            System.out.println("Given number is Prime");
        } else {
            System.out.println("Given number is not Prime");
        }
        sc.close();
    }
}
