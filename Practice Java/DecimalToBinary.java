public class DecimalToBinary {
    public static int convertIntoDecimal(int n){
        if(n <= 1){
            return n;
        }
        int binaryN = 0;
        int place = 1;
        while (n != 0) {
            int remainder = n % 2;
            binaryN += remainder * place;
            n /= 2;
            place *= 10;
        }
        return binaryN;
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(convertIntoDecimal(number));
    }
}