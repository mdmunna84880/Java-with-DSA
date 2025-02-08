public class ModularExponentiation {
    public static int modularExponentiation(int a, int n, int x){
        int pow = 1;
        while (n > 0) {
            if((n & 1) != 0){
                pow *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return pow%x;
    }
    public static void main(String[] args) {
        System.out.println(modularExponentiation(2, 10, 1000));
    }
}
