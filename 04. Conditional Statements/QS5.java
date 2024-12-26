import java.util.Scanner;

public class QS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("It's a leap year");
        }else{
            System.out.println("It's not a leap year");
        }
    }
}