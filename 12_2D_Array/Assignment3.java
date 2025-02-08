public class Assignment3 {
    public static int[][] transposeOfMatrix(int matrix[][]){
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i = 0; i<transpose.length; i++){
            for(int j = 0; j<transpose[0].length; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
    
    public static int[][] printMatrix(int matrix[][]){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        return matrix;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {5, 6, 7}
        };
        printMatrix(matrix);
        System.out.println();
        printMatrix(transposeOfMatrix(matrix));
    }
}
