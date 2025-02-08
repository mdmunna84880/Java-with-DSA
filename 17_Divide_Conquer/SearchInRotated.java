public class SearchInRotated {
    public static int search(int arr[], int si, int ei, int key){
        if(si > ei){
            return -1;
        }

        int mid = (si+ei)/2;
        if(arr[mid] == key){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(arr[si] <= key && arr[mid] > key){
                return search(arr, si, mid-1, key);
            }else{
                return search(arr, mid+1, ei, key);
            }
        }else{
            if(arr[mid] < key && arr[ei] >= key){
                return search(arr, mid+1, ei, key);
            }else{
                return search(arr, si, mid-1, key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int key = 7;
        System.out.println(search(arr, 0, arr.length-1, key));
    }
}
