import java.util.Scanner;

public class Paractice1 {
    public static int calculateSum(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    public static void printHW(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        printHW();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of "+a+" and "+b+" is "+calculateSum(a,b));
    }
}