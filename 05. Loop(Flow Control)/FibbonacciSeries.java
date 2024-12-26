import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();
        int a = 1, b = 1;
        // if(nth == 1){
        //     System.out.println("Fibbonacci series from 1st to "+nth+"st");
        // }else if(nth == 2){
        //     System.out.println("Fibbonacci series from 1st to "+nth+"nd");
        // }else if(nth == 3){
        //     System.out.println("Fibbonacci series from 1st to "+nth+"rd");
        // }else{
        //     System.out.println("Fibbonacci series from 1st to "+nth+"th");
        // }
        for(int i = 1; i <= nth; i++){
            System.out.print(a+", "+b);
            // int temp = a;
            // a = b;
            // b = temp + a;
        }

    }
}
