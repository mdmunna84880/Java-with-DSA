import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key)/3 > 0){
                System.out.println(key);
            }
        }
    }
}
