public class SolidRhombus {
    public static void solidRhombus(int n){
        for(int i = 0; i < n; i++){
            // ? Spaces
            for(int j = n-1; j > i; j--){
                System.out.print("  ");
            }
            // ? Stars
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRhombus(5);
    }
}
