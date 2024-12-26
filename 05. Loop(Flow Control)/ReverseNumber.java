public class ReverseNumber{
    public static void main(String[] args) {
        int num = 99879;
        int rev = 0;
        while(num > 0){
            int lastDigits = num % 10;
            rev = (rev * 10) + lastDigits;
            num /= 10;
        }
        System.out.println(rev);
    }
}