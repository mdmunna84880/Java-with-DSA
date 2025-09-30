public class FloodFIll {
    // Time complexity for this method is O(m*n)
    public static void helper(int[][] image, int sr, int sc, int color, int orginalCol){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != orginalCol){
            return;
        }
        image[sr][sc] = color;
        helper(image, sr + 1, sc, color, orginalCol);
        helper(image, sr - 1, sc, color, orginalCol);
        helper(image, sr, sc + 1, color, orginalCol);
        helper(image, sr, sc - 1, color, orginalCol);
    }
    public static void floodFill(int[][] image, int sr, int sc, int color){
        if(image[sr][sc] == color){
            return ;
        }
        helper(image, sr, sc, color, image[sr][sc]);
        
    }
    public static void main(String[] args){
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        floodFill(image, sr, sc, color);
        for(int[] arr : image ){
            for(int val : arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}