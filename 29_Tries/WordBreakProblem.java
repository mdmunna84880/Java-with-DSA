public class WordBreakProblem {
    static class Node{
        Node children[];
        boolean isEndOfWord;
        public Node() {
            isEndOfWord = false;
            children = new Node[26];
            for (int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word) {
        Node current = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (current.children[idx] == null)
                current.children[idx] = new Node();
            current = current.children[idx];
        }
        current.isEndOfWord = true;
    }
    public static boolean search(String key) {
        Node current = root;
        for (char c : key.toCharArray()) {
            int idx = c - 'a';
            if (current.children[idx] == null){
                return false;
            }
            current = current.children[idx];    
        }
        return current.isEndOfWord;
    }
    public static boolean wordBreakProblem(String key) {
        if(key.length() == 0){
            return true;
        }
        for(int i = 1; i <= key.length(); i++) {
            if(search(key.substring(0, i)) && wordBreakProblem(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};

        for (String word : words){
            insert(word);
        }

        String key = "ilikesamsun";
        System.out.println(wordBreakProblem(key));
    }
}
