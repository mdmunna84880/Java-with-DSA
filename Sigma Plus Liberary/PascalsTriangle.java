public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 7; 

        // Approach: Using a 2D array to store the values of Pascal's Triangle
        // Each row i has i+1 elements, where the first and last elements are 1,
        // and each element in between is the sum of the two elements above it.
        // Time Complexity: O(n^2) where n is the number of rows in the triangle.
        // Space Complexity: O(n^2) for storing the triangle in a 2D array.
        // int[][] triangle = new int[n][n];

        // for (int i = 0; i < n; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         if (j == 0 || j == i) {
        //             triangle[i][j] = 1; // First and last elements in each row are 1
        //         } else {
        //             triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // Sum of the two elements above
        //         }
        //         System.out.print(triangle[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Approach: Using a single array to store the current row of Pascal's Triangle
        // Time Complexity: O(n^2) where n is the number of rows in the triangle.
        int[] currentRow = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j = i; j >= 0; j--) {
                currentRow[j] = (j == 0 || j == i) ? 1 : currentRow[j] + currentRow[j - 1];
                System.out.print(currentRow[j] + " ");
            }
            System.out.println();
        }
    }
}
