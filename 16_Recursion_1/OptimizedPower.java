public class OptimizedPower {

    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSqr = halfPower * halfPower;
        if(n%2 != 0){
            halfPowerSqr *= x;
        }
        return halfPowerSqr;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optimizedPower(x, n));
    }
}
