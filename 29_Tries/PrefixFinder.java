public class PrefixFinder {
    static class Node{
        Node[] children = new Node[26];
        boolean isEndOfWord;
        public Node(){
            isEndOfWord = false;
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }
    static Node root = new Node();

    public static void insert(String word) {
        Node current = root;
        for (char c : word.toCharArray()){
            int index = c - 'a';
            if (current.children[index] == null)
                current.children[index] = new Node();
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
    public static boolean isStartWith(String prefix){
        Node current = root;
        for (char c : prefix.toCharArray()){
            int index = c - 'a';
            if (current.children[index] == null)
                return false;
            current = current.children[index];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "womna"};
        for (String word : words){
            insert(word);
        }
    }
}
