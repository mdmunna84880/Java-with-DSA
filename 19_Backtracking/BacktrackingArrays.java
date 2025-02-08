public class BacktrackingArrays{
    public static void pringArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void backtracking(int arr[], int i, int value){
        if(i == arr.length){
            pringArray(arr);
            return;
        }
        arr[i] = value;
        backtracking(arr, i+1, value+1);
        arr[i] = arr[i]-2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        backtracking(arr, 0, 1);
        System.out.println();
        pringArray(arr);
    }
}