import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ctPl = sc.nextInt();
        float ctPn = sc.nextInt();
        float ctEr = sc.nextInt();
        sc.close();
        float tcItems = ctPl + ctPn + ctEr;
        float GST = tcItems * (18.0f/100);
        float total = tcItems + GST;
        System.out.println(total);
    }
}