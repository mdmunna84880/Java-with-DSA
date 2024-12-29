public class SubArray {
    public static void printSubArray(int array[]) {
        int ts = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    sum += array[k];
                    if(max < array[k]){
                        max = array[k];
                    }
                    if(min > array[k]){
                        min = array[k];
                    }
                }
                System.out.print("   => sum = "+ sum +", min = "+ min + ", max = "+max);
                ts++;
;               System.out.println();
            }
            System.out.println();
        }
        System.out.println("total = "+ts);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArray(arr);

    }
}