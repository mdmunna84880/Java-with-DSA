public class CountingSort {
    public static int[] counting(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++){
            largest = Math.max(largest, num[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i<num.length; i++){
            count[num[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
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
        counting(num);
        printArray(num);
    }
}
