public class BubbleSort {
    public static int[] bubble(int num[]){
        int n = num.length;
        for(int turn = 0; turn < n-1; turn++){
            boolean swap = false;
            for(int j = 0; j < n-turn-1; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                return num;
            }
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
        bubble(num);
        printArray(num);
    }
}