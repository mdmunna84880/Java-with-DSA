public class FindPrefix {
    static class Node{
        Node[] children = new Node[26];
        boolean isEndOfWord;
        int freq;
        public Node(){
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node current = root;
        for(char c : word.toCharArray()){
            int idx = c - 'a';
            if(current.children[idx] == null){
                current.children[idx] = new Node();
            }else{
                current.children[idx].freq++;
            }
            current = current.children[idx];
        }
    }

    public static void findPrefic(Node root, String ans){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < root.children.length; i++){
            if(root.children[i] != null){
                findPrefic(root.children[i], ans + (char)(i + 'a'));
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for (String word : arr) {
            insert(word);
        }
        root.freq = -1;
        findPrefic(root, "");
    }
}
