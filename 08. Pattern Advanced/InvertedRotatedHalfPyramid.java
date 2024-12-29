public class InvertedRotatedHalfPyramid {
    public static void inverted_rotated_half_pyramid(int num){
        for(int i = 0; i < num; i++){
            // ? Spaces
            // ? First Way
            // for(int j = num-1; j > i; j--){
            //     System.out.print("  ");
            // }
            // ? Second Way
            for(int j = 0; j < num-i-1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(7);
    }
}
