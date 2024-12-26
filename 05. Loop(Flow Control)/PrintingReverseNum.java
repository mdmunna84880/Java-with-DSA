public class PrintingReverseNum {

     public static void main(String[] args) {
        int num = 10889;
        while(num > 0){
            int lastDigits = num % 10;
            System.out.print(lastDigits);
            num = num/10;
        }
     }
}