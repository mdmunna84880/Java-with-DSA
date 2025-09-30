public class Kadans {
    public static void sortColors(int[] nums) {
        int[] arr = new int[3];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 || nums[i] == 1 || nums[i] == 2){
                arr[nums[i]]++;
            }
        }
        
        int idx = 0;        
        for(int i = 0; i < nums.length; i++){
            if(arr[idx] > 0){
                nums[i] = idx;
                arr[idx]--;
            }
            if(arr[idx] == 0){
                idx++;
            } 
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,0};
        sortColors(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+"  ");
        }
    }
}
