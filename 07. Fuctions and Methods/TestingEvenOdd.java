import java.util.*;
public class TestingEvenOdd {
    public static boolean isEvenOdd(int num){
        if(num % 2 == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(isEvenOdd(num)){
            System.out.println("The number is Even Number");
        }else{
            System.out.println("The number is Odd Number");
        }
        sc.close();
    }
}