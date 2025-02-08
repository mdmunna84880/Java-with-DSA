import java.util.Stack;

public class MaxAreaHistogram {
    public static void maxHistogram(int arr[]){
        int n = arr.length;
        int maxArea = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        int nsl[] = new int[n];
        int nsr[] = new int[n];

        // ? Next right smaller
        for(int i = n-1; i >= 0; i--){
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.empty()){
                nsr[i] = n;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // ? Next left smaller
        s = new Stack<>();
        for(int i = 0; i < n; i++){
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.empty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // ? Finding maximum area and width is nsr-nsl-1
        for(int i = 0; i < n; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }
        System.out.println("The maxium area of Histogram traingle is "+maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2,4};
        maxHistogram(arr);
        
    }
}
