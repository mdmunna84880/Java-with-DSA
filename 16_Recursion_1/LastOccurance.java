public class LastOccurance {
    public static int lastOccurance(int arr[], int key, int i){
        if(arr.length == i){
            System.out.println(i);
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && key == arr[i]){
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) {
        int arr[] = {8, 5, 6, 9, 5, 10, 2, 6, 3};
        System.out.println(lastOccurance(arr, 8, 0));
    }
}
