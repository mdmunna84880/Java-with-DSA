public class Assignment1 {
    public static void assignment(int arr[], int i, int key){
        if(arr.length == i){
            return;
        }
        if(key == arr[i]){
            System.out.print(i+" ");
        }
        assignment(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        assignment(arr, 0, 2);
    }
}
