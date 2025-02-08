public class Assignment3 {
    public static int merge(int nums[], int si, int ei, int mid){
        int i = si;
        int j = mid;
        int k = 0;
        int count = 0;
        int temp[] = new int[ei-si+1];
        while (i < mid && j <= ei) {
            if(nums[i] <= nums[j]){
                temp[k] = nums[i];
                i++;
            }else{
                temp[k] = nums[j];
                count += (mid-i);
                j++;
            }
            k++;
        }
        while (i < mid) {
            temp[k] = nums[i];
            k++;
            i++;
        }
        while (j <= ei) {
            temp[k] = nums[j];
            k++;
            j++;
        }
        for(k = 0, i = si; k < temp.length; k++, i++){
            nums[i] = temp[k];
        }
        return count;
    }
    public static int inversionCount(int nums[], int si, int ei){
        int count = 0;
        if(ei > si){

            int mid = si + (ei-si)/2;
            count = inversionCount(nums, si, mid);
            count += inversionCount(nums, mid+1, ei);
            count += merge(nums, si, ei, mid+1);

        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1, 20, 6, 4, 5};
        System.out.println(inversionCount(nums, 0, nums.length-1));
    }
}