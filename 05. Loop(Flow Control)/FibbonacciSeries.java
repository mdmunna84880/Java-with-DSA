import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();
        sc.close();
        int a = 0, b = 1;
        if(nth == 0){
            System.out.println("Fibonacci series from 0th to "+nth+"th term:"+a);
        }else{
            System.out.println("Fibonacci series from 0th to "+nth+"th term: ");
        }

       if(nth == 1){
        System.out.println(a+" ");
       }else if(nth >= 2){
            System.out.print(a+" "+b+" ");
        }
        for(int i = 3; i <= nth; i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }

    }
}
