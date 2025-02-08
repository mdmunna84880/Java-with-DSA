public class SearchingInSorted {
    // First Approach
    public static boolean searchIn2D(int matrix[][], int key){
        int row = matrix.length-1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if(key == matrix[row][col]){
                System.out.println("The key is found at ("+row+", "+col+")");
                return true;
            }else if(key < matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("The key is not found");
        return false;
    }

    // Second Approach of same time complexity
    public static boolean searchIn2d(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if(key == matrix[row][col]){
                System.out.println("The key is found at ("+row+", "+col+")");
                return true;
            }else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("The key is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
        };
        int key = 9;
        searchIn2d(matrix, key);
        searchIn2D(matrix, key);
    }

}
