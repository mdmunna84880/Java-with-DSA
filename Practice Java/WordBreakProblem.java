public class WordBreakProblem {
    static class Node{
        Node children[];
        boolean eow = false;

        public Node(){
            children = new Node[26];
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();
    private static void insert(String str){
        Node curr = root;

        for(int i = 0; i < str.length(); i++){
            
            // if(curr.children[]);
        }
    }
}