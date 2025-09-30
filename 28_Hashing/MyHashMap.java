import java.util.*;

public class MyHashMap {
    static class HashMap<K, V>{//Why do we take angular braket in that bracket we also take unknown letters
        private class  Node {
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node> bukket[];

        
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.bukket = new LinkedList[4];//Why do we intialize like this we generally initialize with angular bracket
            this.N = 4;
            // Initialize each bucket to an empty linked list.  This ensures that
            for (int i = 0; i < N; i++) {
                bukket[i] = new LinkedList<>();//When we initialize integer arrays we don't need to initialize one by one then why here is
            }
        }

        private int hashFunction(K key){
            int hash = key.hashCode();
            return Math.abs(hash)%N;
        }
        
        private int SearchInLL(K key, int bi) {
            LinkedList<Node> bucket = bukket[bi];
            int di = 0;
            for (int i = 0; i < bucket.size(); i++) {
                Node node = bucket.get(i);
                if(node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node>[] oldBukket = bukket;
            N *= 2;
            bukket = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                bukket[i] = new LinkedList<>();
            }

            for (int bi = 0; bi < oldBukket.length; bi++) {
                LinkedList<Node> bucket = oldBukket[bi];
                for (int i = 0; i < bucket.size(); i++) {
                    Node node = bucket.remove();
                    put(node.key, node.value);
                }
            }

        }
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di == -1) {
                bukket[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = bukket[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n / N;
            if(lambda > 2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di == -1) {
                return false;
            } else {
                return true;
            }
        }
        public V getV(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di == -1) {
                return null;
            } else {
                Node node = bukket[bi].get(di);
                return node.value;
            }
        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di == -1) {
                return null;
            } else {
                return bukket[bi].remove(di).value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<K>();
            for(LinkedList<Node> buck : bukket){
                for(Node node : buck){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("China", 150);
        hm.put("Japan", 400);
        hm.put("Indonesia", 70);
        System.out.println(hm.keySet());
        System.out.println(hm.getV("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.keySet());
        ArrayList<String> keys= hm.keySet();
        for(String key : keys){
            System.out.println(key+" = "+hm.getV(key));
        }
        System.out.println(hm.isEmpty());
    }
}
