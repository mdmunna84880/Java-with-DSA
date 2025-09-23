// import java.util.Arrays;

public class Solution {
    private static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12};

        System.out.println("Before reversing the array");
        printArray(nums);

        int left = 0, right = nums.length - 1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        System.out.println("After reversing the array");
        printArray(nums);
    }
}
