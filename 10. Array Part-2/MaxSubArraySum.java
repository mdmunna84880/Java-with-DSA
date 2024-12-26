public class MaxSubArraySum {
        public static void maxSubArraySum(int array[]) {
            int curSum = 0, maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    curSum = 0;
                    for (int k = i; k <= j; k++) {
                        System.out.print(array[k] + " ");
                        curSum += array[k];
                    }
                    if(maxSum < curSum){
                        maxSum = curSum;
                    }
                    System.out.print("=> sum = "+curSum);
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("Max sum = "+ maxSum);
        }

        public static void main(String[] args) {
            int arr[] = { 1, -2, 6, -1, 3 };
            maxSubArraySum(arr);

        }
}
