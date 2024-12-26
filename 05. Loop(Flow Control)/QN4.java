import java.util.Scanner;
public class QN4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The table of "+n+" is:");
        for(int i = 1; i <= 10; i++){
            int table = i * n;
            System.out.println(table);
        }
        sc.close();
    }
}
