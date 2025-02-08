public class Assignment2 {

    public static int countInRange(int nums[], int num, int si, int ei){
        int count = 0;
        for(int i = si; i <= ei; i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }

    public static int majorityElement(int nums[], int si, int ei){
        if(si == ei){
            return nums[si];
        }
        int mid = si + (ei-si)/2;
        // ? Left Side
        int left = majorityElement(nums, si, mid);
        // ? Right Side
        int right = majorityElement(nums, mid+1, ei);

        // ? Check if the right and left element found in mejority or not
        if(left == right){
            return left;
        }

        // ? If not found then count the mejority element
        int leftCount = countInRange(nums, left, si, ei);
        int rightCount = countInRange(nums, right, si, ei);

        return leftCount > rightCount ? left : right;

    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums, 0, nums.length-1));
    }
}
