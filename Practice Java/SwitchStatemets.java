import java.util.Scanner;

public class SwitchStatemets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character for Day like Mon for Monday and so on");
        String ch = sc.next();
        switch(ch){
            case "Mon": System.out.println("Monday");
            break;
            case "Tue": System.out.println("Tuesday");
            break;
            case "Wed": System.out.println("Wednesday");
            break;
            case "Thu": System.out.println("Thursday");
            break;
            case "Fri": System.out.println("Friday");
            break;
            case "Sat": System.out.println("Saturday");
            break;
            default: System.out.println("Sunday");
        }
        sc.close();
    }
}