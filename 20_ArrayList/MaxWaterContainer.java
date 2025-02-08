import java.util.*;

public class MaxWaterContainer{
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int size = height.size();
        for(int i = 0; i < size; i++){
            for(int  j = i+1; j < size; j++){
                int minHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int curWater = minHeight*width;
                maxWater = Math.max(maxWater, curWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}