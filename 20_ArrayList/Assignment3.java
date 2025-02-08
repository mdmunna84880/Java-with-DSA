import java.util.ArrayList;

public class Assignment3 {
    public static int mostFrequently(ArrayList<Integer> list, int key){
        // ArrayList<Integer> result = new ArrayList<>();
        int result[] = new int[1000];
        for(int i = 0; i < list.size(); i++){
            if(key == list.get(i)){
                result[list.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0; 
        for(int i = 0; i < 1000; i++){
            if(max < result[i]){
                max = result[i];
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        int key = 2;
        System.out.println(mostFrequently(list, key));
    }
}
