public class TypePromotion {
    public static void main(String[] args) {
        byte a = 4;
        short b = 6;
        char c = 'a';
        // int sum = a + b + c;
        // byte sum = a + b + c;
        // System.out.println(sum);
        int d = 799;
        long e = 9809l;
        float f = 789.90f;
        double g = 79879.89;
        double sum = a + b + c + d + e + f + g;
        System.out.println(sum);
    }
}
