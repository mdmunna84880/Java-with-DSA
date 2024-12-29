public class Butterfly {
    public static void butterfly(int n){
        for(int i = 0; i < n; i++){
            // ? Stars
            for(int j = 0; j <= i; j++){
               System.out.print("* ");
            }
            // ? Spaces
            for(int j = 0; j < 2* (n-i-1); j++){
                System.out.print("  ");
            }
            // ? Stars
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
             }
            System.out.println();
        }
        for(int i = n-1; i >= 0; i--){
            // ? Stars
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
             }
             // ? Spaces
             for(int j = 0; j < 2* (n-i-1); j++){
                 System.out.print("  ");
             }
             // ? Stars
             for(int j = 0; j <= i; j++){
                 System.out.print("* ");
              }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly(4);
    }
}
