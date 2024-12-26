import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int n){

        int palindrome = n;
        int reverse = 0;
        while(n > 0){
            int remain = n%10;
            reverse = reverse * 10 + remain;
            n /= 10;
        }
        if(palindrome == reverse) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether the number is palindrome or not: ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
        sc.close();
    }
}
