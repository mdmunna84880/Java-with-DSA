public class LongestWordPrefix {
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
    static StringBuilder ans = new StringBuilder("");
    public static void insert(String word){
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if(temp.children[index] == null){
                temp.children[index] = new Node();
            }
            temp = temp.children[index];
        }
        temp.isEndOfWord = true;
    }
    public static void longestWordPrefix(Node root, StringBuilder temp){
        if(root  == null){
            return;
        }
        for(int i = 0; i < root.children.length; i++){
            if(root.children[i] != null && root.children[i].isEndOfWord){
                temp.append((char)('a' + i));
                if(temp.length() > ans.length()){
                    ans = new StringBuilder(temp);
                }
                longestWordPrefix(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestWordPrefix(root, new StringBuilder(""));
        System.out.println(ans);
    }
}