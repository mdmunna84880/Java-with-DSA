import java.util.Scanner;

public class SumDigits {
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of digits is "+sumOfDigits(n));
    }
}
