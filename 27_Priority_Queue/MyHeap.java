import java.util.*;
public class MyHeap {
    static class Heap{
        ArrayList<Integer> list = new ArrayList<Integer>();

        public void add(int el){
            list.add(el);
            int childIdx = list.size()-1;
            int parentIdx = (childIdx-1)/2;
            while (childIdx > 0 && list.get(childIdx) < list.get(parentIdx)) {
                int temp = list.get(childIdx);
                list.set(childIdx, list.get(parentIdx));
                list.set(parentIdx, temp);
                childIdx = parentIdx;
                parentIdx = (childIdx-1)/2;
            }
        }

        public int peek(){
            return list.get(0);
        } 

        public boolean isEmpty(){
            return list.isEmpty();
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int min = i;

            if(left < list.size() && list.get(left) < list.get(min)){
                min = left;
            }
            if(right < list.size() && list.get(right) < list.get(min)){
                min = right;
            }
            if(min!= i){
                int temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
                heapify(min);
            }
        }

        public int remove(){
            if(list.isEmpty()){
                return -1;
            }
            int data = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);

            //Heapify Methods
            heapify(0);
            return data;
    }
    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.add(1);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
}
