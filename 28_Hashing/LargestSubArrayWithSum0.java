import java.util.*;
public class LargestSubArrayWithSum0 {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, len = 0;
        for(int j = 0; j < arr.length; j++){
           sum += arr[j];
           if(map.containsKey(sum)){
                len = j - map.get(sum);
           }else{
                map.put(sum, j);
           }
        }
        System.out.println("The largest sum of subarray with 0 of length is "+len);
    }
}
