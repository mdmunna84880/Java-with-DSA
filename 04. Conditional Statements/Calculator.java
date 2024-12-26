import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter operator to perform some operation: ");
        char operator = sc.next().charAt(0);
        sc.close();
        switch (operator) {
            case '+': System.out.println(num1 + num2);
            break;
            case '-': System.out.println(num1 - num2);
            break;
            case '*': System.out.println(num1 * num2);
            break;
            case '/': System.out.println(num1 / num2);
            break;
            default: System.out.println("Your operator is wrong");
        }
    }
}