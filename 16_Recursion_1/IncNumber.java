public class IncNumber {

    public static void printInc(int n, int i){
        if(n == i){
            System.out.println(n);
            return;
        }
        System.out.println(i);
        printInc(n, i+1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        printInc(n, 1);
        printInc(n);
    }
}
