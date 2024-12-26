public class InbuiltMathFn {
    public static int minFn(int a, int b){
        return Math.min(a, b);
    }
    public static int maxFn(int a, int b){
        return Math.max(a, b);
    }
    public static int sqrtFn(int a){
        return (int)Math.sqrt(a);
    }
    public static int powFn(int a, int b){
        return (int)Math.pow(a, b);
    }
    // public static int avgFn(int a, int b){
    //     return i
    // }
    public static int absFn(int a){
        return Math.abs(a);
    }
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 4;
        System.out.println("Min "+minFn(num1, num2));
        System.out.println("Max "+maxFn(num1, num2));
        System.out.println("Sqrt "+sqrtFn(num1));
        System.out.println("Pow "+powFn(num1, num2));
        System.out.println("Abs "+absFn(num2));
    }
}
