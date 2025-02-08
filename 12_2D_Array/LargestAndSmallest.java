import java.util.Scanner;

public class LargestAndSmallest {

    public static int largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        return largest;
    }

    public static int smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // ? Taking Input
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // ? Printing Matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The smallest and larges are ("+smallest(matrix)+","+largest(matrix)+")");

    }
}