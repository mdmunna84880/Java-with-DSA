public class SpiralMatrix {
    public static void spiralMatrix(int matrix[][]){
        int sr = 0;
        int er = matrix.length-1;
        int sc = 0;
        int ec = matrix[0].length-1;
        while (sr <= er && sc <= ec) {
            // top
            for(int i = sc; i <= ec; i++){
                System.out.print(matrix[sr][i]+" ");
            }

            // right
            for(int j = sr+1; j <= er; j++){
                System.out.print(matrix[j][ec]+" ");
            }

            // bottom
            for(int i = ec-1; i >= sc; i--){
                if(sr == er){
                    break;
                }
                System.out.print(matrix[er][i]+" ");
            }

            // left
            for(int j = er-1; j > sr; j--){
                if(sc == ec){
                    break;
                }
                System.out.print(matrix[j][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {6, 5, 4}
        };
        spiralMatrix(matrix);
    }
}
