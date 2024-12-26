public class BinaryToDecimal {
    public static int lastDigits(int remain, int pow){
        return remain * (int)Math.pow(2, pow);
    }
    public static int decimal(int binNo){
        int pow = 0;
        int decimal = 0;
        while(binNo > 0){
            int remain = binNo % 10;
            // System.out.println(rem);
            decimal += lastDigits(remain, pow);
            pow++;
            binNo /= 10;
        }
        return decimal;
    }
    public static void decimalNo(int binNo){
        int power = 0;
        int decimal = 0;
        while(binNo > 0){
            int lastDigit = binNo % 10;
            decimal += lastDigit * (int) Math.pow(2, power);
            binNo /= 10;
            power++;
        }
        System.out.println(decimal);

    }
    public static void main(String[] args) {
        System.out.println(decimal(111));
        decimalNo(111);

    }
}
