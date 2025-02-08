public class FirstOccurance {
    public static int firstOccurance(int arr[], int key, int i){
        if(key == arr[i]){
            return i;
        }
        if(arr.length == i){
            return -1;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurance(arr, 5, 0));
    }
}
