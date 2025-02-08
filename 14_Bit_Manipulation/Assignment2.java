public class Assignment2 {
    public static void swap(int a, int b){
        b = a ^ b;
        System.out.println(b);
        a = a ^ b;
        System.out.println(a);
        b = a ^ b;
        System.out.println(b);
        System.out.println("a = "+a+", b = "+b);
    }
    public static void main(String[] args) {
        swap(5, 7);
    }
}
