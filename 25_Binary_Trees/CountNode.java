public class CountNode {
    static class Node{
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }

    static class Trees{
        static int idx = -1;
        public static Node buildTree(int[] items){
            idx++;
            if(items[idx] == -1 || items.length < idx){
                return null;
            }
            Node newNode = new Node(items[idx]);
            newNode.left = buildTree(items);
            newNode.right = buildTree(items);
            return newNode;
        }

        public static int countNode(Node root){
            if(root == null){
                return 0;
            }
            int leftCount = countNode(root.left);
            int rightCount = countNode(root.right);
            return leftCount + rightCount + 1;
        }
        }
        public static void main(String[] args) {
            int[] items = {1, 2, 3, -1, -1, 4, 5, -1, -1, -1, 6, 7, -1, -1, -1};
            Node root = Trees.buildTree(items);
            System.out.println("Number of nodes: " + Trees.countNode(root));
        }
}
