import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int product = num1 * num2;
        sc.close();
        System.out.println(product);
    }
}
