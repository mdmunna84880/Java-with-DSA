import java.util.*;

public class HollowRectangle {
    public static void hollowRectangle(int width, int length){
        for(int i = 0; i <= width; i++){
            for(int j = 0; j <= length; j++){
                if(i == 0 || j == 0 || i == width || j == length){
                   System.out.print("* "); 
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of the rectangle: ");
        int width = sc.nextInt();
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();
        sc.close();
        hollowRectangle(width, length);
    }
}