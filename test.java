public class test{
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int[] array){
        boolean isSorted = false;
        for(int i = 0; i < array.length; i++){
            isSorted = true;
            for(int j = 0; j < array.length-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSorted = false;
                }else{

                }
            }
            if(isSorted){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3, 5, 9, 3, 5,7};
        sort(arr);
        printArr(arr);
    }
}