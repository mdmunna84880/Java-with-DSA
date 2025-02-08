public class Assignment2 {
    // ? First Method
    public static int search(int num[], int target){
        int low = 0;
        int high = num.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(num[mid] == target){
                return mid;
            }else if(num[mid] > num[low]){
                if(num[mid] > target && num[low] <= target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(num[mid] < target && num[high] >= target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    // ? Second Method

    public static void main(String[] args) {
        int num[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        System.out.println("The element index found on "+search(num, target));
    }
}
