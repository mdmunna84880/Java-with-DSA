import java.util.Stack;

public class NextGreater {
    public static void nextGreater(int arr[], int nextGre[]){
        int n = arr.length;
        Stack<Integer> s = new Stack<>();

        for(int i = n-1; i >= 0; i--){

            // ? Finding next greater
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // ? Initializing with next greater
            if(s.isEmpty()){
                nextGre[i] = -1;
            }else{
                nextGre[i] = arr[s.peek()];
            }

            // ? Pushing index of next greater
            s.push(i);
        }
    }

    // ? Print array
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, -1, 2, 4};
        int nextGre[] = new int[arr.length];
        nextGreater(arr, nextGre);
        printArr(nextGre);
    }
}
