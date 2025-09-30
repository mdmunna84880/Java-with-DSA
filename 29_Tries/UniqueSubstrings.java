public class UniqueSubstrings {
    static class Node{
        Node[] children;
        boolean isEndOfWord;
        public Node(){
            children = new Node[26];
            isEndOfWord = false;
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i< root.children.length; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "apple";
        for(int i=0; i<str.length(); i++){
            insert(str.substring(i));
        }
        System.out.println("Number of unique substrings: " + countNode(root));
    }
}
