import java.util.ArrayList;

public class PairSum1Op {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
         int rp = list.size()-1;
         while (lp < rp) {
            int sum = list.get(rp)+list.get(lp);
            if(sum == target){
                return true;
            }else if(sum < target){
                lp++;
            }else{
                rp--;
            }
         }
         return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;
        for(int i = 1; i <= 6; i++){
            list.add(i);
        }
        System.out.println(pairSum(list, target));
    }
}
