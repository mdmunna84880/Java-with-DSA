public class SumOfFirstN {
    public static int sumN(int n){
        if(n == 1){
            return 1;
        }
        return n+sumN(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumN(n));
    }
}
