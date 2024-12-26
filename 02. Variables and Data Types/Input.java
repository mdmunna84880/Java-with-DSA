import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your only first name: ");
        // String ftName = sc.next();
        // System.out.println(ftName);

        System.out.print("Enter your full name: ");
        String flName = sc.nextLine();
        System.out.println(flName);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println(number);

        System.out.print("Enter either true or false: ");
        boolean tF = sc.nextBoolean();
        System.out.println(tF);

        System.out.print("Enter small no: ");
        byte sNo = sc.nextByte();
        System.out.println(sNo);
        
        System.out.print("Enter medium size no: ");
        short shortNo = sc.nextShort();
        System.out.println(shortNo);
        sc.close();
    }
}
