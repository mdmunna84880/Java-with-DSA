public class HollowRhombus {
    public static void hollowRhombus(int n){
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--){
                System.out.print("  ");
            }
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || j == n-1 || i == n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRhombus(4);
    }
}
