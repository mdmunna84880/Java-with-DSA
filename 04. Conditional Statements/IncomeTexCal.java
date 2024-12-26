import java.util.Scanner;

public class IncomeTexCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        sc.close();
        float tax;
        if(salary >= 300000 && salary <= 600000){
            tax = salary * 0.05f;
        }else if(salary >= 600001 && salary <= 900000){
            tax = salary * 0.1f;
        }else if(salary > 900000 && salary <= 1200000){
            tax = salary * 0.15f;
        }else if(salary > 1200000 && salary <= 1500000){
            tax = salary * 0.2f;
        }else if (salary > 1500000) {
            tax = salary * 0.3f;
        }else{
            tax = 0;
        }
        System.out.println(tax);
    }
}
