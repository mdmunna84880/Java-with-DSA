import java.util.Scanner;

public class MonthsDayCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months = sc.nextInt();
        sc.close();
        if(months == 2){
            System.out.println("February = 28 or 29 days");
        }else if(months < 8){
            if(months % 2 == 0){
                System.out.println("30 Days");
            }else{
                System.out.println("31 Days");
            }
        }else if(months > 8 & months <= 12){
            if(months % 2 == 0){
                System.out.println("31 Days");
            }else{
                System.out.println("30 Days");
            }
        }else{
            System.out.println("Not valid number! Just enter 1 to 12");
        }
    }
}
