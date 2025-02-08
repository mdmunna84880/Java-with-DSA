public class Assignment2 {
    public static int sumOf2ndRow(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[1][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,4,9},{11,4,3},{2,2,3},
        };
        System.out.println("The sum of 2nd Row is "+sumOf2ndRow(matrix));
    }
}
