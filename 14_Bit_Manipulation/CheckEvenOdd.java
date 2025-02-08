public class CheckEvenOdd {
    public static void isEvenOdd(int num){
        int bitmask = 1;
        if((num & bitmask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        isEvenOdd(8);
        isEvenOdd(7);
    }
}
