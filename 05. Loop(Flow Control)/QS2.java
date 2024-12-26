import java.util.Scanner;

public class QS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        boolean confirmation = true;
        while(confirmation == true){
           System.out.println("Enter a number: ");
           int n = sc.nextInt();
           if(n % 2 == 0){
            evenSum += n;
           }else{
            oddSum += n;
           }
           System.out.println("type 'true' for continue, Press other key to exit");
           confirmation = sc.nextBoolean();
        }
        System.out.println("The sum of even number is "+evenSum);
        System.out.println("The sum of odd number is "+oddSum);
        sc.close();
    }
}
