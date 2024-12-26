import java.util.Scanner;

public class QS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num > 0){
            System.out.println("The number is positive");
        }else if(num == 0){
            System.out.println("The number is neither positive nor negative");
        }else{
            System.out.println("The number is negative");
        }
    }
}
