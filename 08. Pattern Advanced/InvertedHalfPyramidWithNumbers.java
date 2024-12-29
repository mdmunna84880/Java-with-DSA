public class InvertedHalfPyramidWithNumbers {
    public static void inverted_half_pyramid_number(int num){
        
        for(int i = 0; i < num; i++){
            // ? First Way
            // int a = 1;
            // for(int j = 0; j < num-i; j++){
            //     System.out.print(a+" ");
            //     a++;
            // }
            // ? Second Way
            for(int j = 1; j <= num-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid_number(4);
    }
}
