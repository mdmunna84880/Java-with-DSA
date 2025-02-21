public class HeapSort {
    public static void heapify(int arr[], int size, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        // Check if left child exists and is larger than root
        if (left < size && arr[i] < arr[left])
        largest = left;
        
        // Check if right child exists and is larger than largest so far
        if (right < size && arr[largest] < arr[right])
        largest = right;

        // If largest is not i, then swap arr[i] with arr[largest]
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, size, largest);
        }
    }
    public static void sort(int arr[]){
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--)
            heapify(arr, n, i);
            
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
