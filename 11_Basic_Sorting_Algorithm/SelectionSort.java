public class SelectionSort {
    public static int[] selection(int num[]){
        for(int i = 0; i < num.length-1; i++){
            int minPos = i;
            for(int j = i+1; j < num.length; j++){
                if(num[minPos] < num[j]){
                    minPos = j;
                }
            }
            int temp = num[i];
            num[i] = num[minPos];
            num[minPos] = temp;

        }
        return num;
    }
    public static void printArray(int num[]){
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 3, 7, 5, 6, 1};
        selection(num);
        printArray(num);
    }
}
