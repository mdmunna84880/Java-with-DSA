public class MergeTwoSortedArray {

    private static void merge(int[] arr1, int m, int[] arr2, int n){
        int i = m-1, j = n-1, k = m+n-1;

        while(j >= 0 && i >= 0){
            arr1[k--] = (arr1[i] > arr2[j]) ? arr1[i--] : arr2[j--];
        }

        while(j >= 0){
            arr1[k--] = arr2[j--];
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 0, 0, 0};
        int arr2[] = {2, 5, 6};
        int m = 3; // Number of elements in arr1 excluding zeros
        int n = 3; // Number of elements in arr2
        // Merging arr2 into arr1
        merge(arr1, m, arr2, n);
        // Printing the merged array
        for(int i = 0; i < m + n; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
