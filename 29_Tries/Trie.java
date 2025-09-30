public class Trie {
    static  class Node{
        Node[] children = new Node[26];
        boolean isEnd = false;
        Node(){
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(char ch : word.toCharArray()){
            int idx = ch - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }

    public static boolean search(String word){
        Node curr = root;
        for(char ch : word.toCharArray()){
            int idx = ch - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEnd;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("the")); // true
        System.out.println(search("them")); // false
        System.out.println(search("their")); // true
    }
}