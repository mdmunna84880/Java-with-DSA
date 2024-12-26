public class HollowRectangle {
    public static void main(String[] args) {
        int height = 4; 
        int width = 6;
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(i == 0 || j == 0 || i == height - 1 || j == width -1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
