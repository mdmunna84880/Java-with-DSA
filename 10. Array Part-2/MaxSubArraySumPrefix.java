public class MaxSubArraySumPrefix {
    public static void maxSubArraySum(int array[]) {
        int curSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
            System.out.print(prefix[i]+"  ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                curSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.print("  current sum "+ curSum);
                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubArraySum(arr);

    }

}
