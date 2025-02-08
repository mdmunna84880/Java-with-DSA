import java.util.*;

public class Assignment2 {
    public static ArrayList<Integer> lonelyNum(ArrayList<Integer> nums){
        Collections.sort(nums);
        int n = nums.size();
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 1; i < n-1; i++){
            if(nums.get(i-1) + 1 < nums.get(i) && nums.get(i) < nums.get(i+1) - 1){
                temp.add(nums.get(i));
            }
        }
        if(n == 1){
            temp.add(nums.get(0));
        }
        if(n > 1){
            if(nums.get(1) - 1 > nums.get(0)){
                temp.add(nums.get(0));
            }
            if(nums.get(n-1) > nums.get(n-2) + 1){
                temp.add(nums.get(n-1));
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        System.out.println(lonelyNum(nums));
    }
}
