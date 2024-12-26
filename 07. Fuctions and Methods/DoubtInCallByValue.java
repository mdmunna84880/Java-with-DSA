public class DoubtInCallByValue {
    public static int change(int a){
        return a = 90;
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println(change(a));
    }
}
