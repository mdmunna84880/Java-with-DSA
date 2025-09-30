public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 5}; // Example array with a missing number
        int n = arr.length; // Length of the array

        // Approach: Using the formula for the sum of the first n natural numbers
        // Time Complexity: O(n) for iterating through the array
        // Space Complexity: O(1) since we are using a constant amount of space

        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0; // Variable to store the sum of elements in the array

        for (int num : arr) {
            actualSum += num; // Calculate the sum of elements in the array
        }

        int missingNumber = expectedSum - actualSum; // The missing number is the difference
        System.out.println("The missing number is: " + missingNumber); // Output the result

        // Alternative Approach: Using XOR to find the missing number

        int xor = n; // Variable to store the XOR result
        for (int i = 0; i < n; i++) {
            xor ^= i;
            xor ^= arr[i]; // XOR all elements in the array
        }
        System.out.println("The missing number using XOR is: " + xor); // Output the result using XOR
    }
}
