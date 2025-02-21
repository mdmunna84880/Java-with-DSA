import java.util.*;
public class WeakestSoldier {

    static class  Soldier implements Comparable<Soldier>{
     int soldier;
     int idx;
     Soldier(int soldier, int idx){
         this.soldier = soldier;
         this.idx = idx;
     }
     @Override
     public int compareTo(Soldier other) {
         if(this.soldier == other.soldier){
             return this.idx - other.idx;
         }else{
             return this.soldier - other.soldier;
         }
     }        
    }
    public static void main(String[] args) {
        int army[][] = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int k = 2;
        PriorityQueue<Soldier> queue = new PriorityQueue<>();
        for(int i = 0; i < army.length; i++) {
            int count = 0;
            for(int j = 0; j < army[i].length; j++){
                count += army[i][j] == 1 ? 1 : 0;
            }
            queue.add(new Soldier(count, i));
        }

        for(int i = 0; i < queue.size() && i < k; i++){
            System.out.println("row"+queue.remove().idx);
        }
    }
}
