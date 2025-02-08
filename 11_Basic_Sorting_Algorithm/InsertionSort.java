public class InsertionSort {
    public static int[] insertion(int num[]){
        for(int i = 1; i < num.length; i++){
            int curElement = num[i];
            int preIndex = i-1;
            while (preIndex >= 0 && num[preIndex] > curElement) {
                num[preIndex+1] = num[preIndex];
                preIndex--;
            }
            num[preIndex+1] = curElement;
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
        insertion(num);
        printArray(num);
    }
}
