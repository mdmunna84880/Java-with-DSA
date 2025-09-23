public class BineryDecimal {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit == 1) {
                sum += lastDigit << count;
            }

            count++;
            n /= 10;
        }
        System.out.println(sum);
    }
}
