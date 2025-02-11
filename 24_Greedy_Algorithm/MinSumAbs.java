import java.util.Arrays;
public class MinSumAbs {
    public static void main(String[] args) {
        int A[] = {1,7,5};
        int B[] = {2,3,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            // Calculate the absolute difference between the elements of the two arrays
            minDiff += Math.subtractExact(A[i], B[i]);
        }
        System.out.println("Minimum sum of absolute differences: " + minDiff);
    }
}
