import java.util.ArrayList;

public class PairSum1 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int size = list.size();
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 50;
        for(int i = 1; i <= 6; i++){
            list.add(i);
        }
        System.out.println(pairSum(list, target));
        
    }
}
