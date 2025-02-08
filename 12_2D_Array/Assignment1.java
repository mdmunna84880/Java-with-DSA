public class Assignment1 {
    public static int countPresence2D(int matrix[][], int num){
        int count = 0;
       for(int i = 0; i<matrix.length; i++){
        for(int j = 0; j<matrix[0].length; j++){
            if(matrix[i][j] == num){
                count++;
            }
        }
       }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {4,7,8},{8,8,7} 
        };
        int num = 7;
        int count = countPresence2D(matrix, num);
        if(count == 0){
            System.out.println("The number "+num+"is not found");
        }else{
            System.out.println("The number "+num+"is found "+count+" times in this matrix");
        }
    }
}
