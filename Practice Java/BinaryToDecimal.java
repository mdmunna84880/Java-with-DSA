public class BinaryToDecimal {
    public static int convertIntoDecimal(int n){
        if(n <= 1){
            return n;
        }

        int decimalN = 0;
        int i = 0;
        while(n != 0){
            int remainder = n % 10;
            decimalN += remainder << i;
            n /= 10;
            i++;
        }

        return decimalN;
    }
    public static void main(String[] args) {
        System.out.println(convertIntoDecimal(110));
    }
}
