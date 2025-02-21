public class DiaOfNodes {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BuildTree{
        static int idx = -1;
        public static Node buildTree(int[] items){
            idx++;
            if(items[idx] == -1 || idx >= items.length){
                return null;
            }
            Node newNode = new Node(items[idx]);
            newNode.left = buildTree(items);
            newNode.right = buildTree(items);
            return newNode;
        }
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int selfDiameter = leftHeight + rightHeight + 1;
            return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
        }
        public static void main(String[] args) {
            int[] items = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            Node root = buildTree(items);
            System.out.println("Diameter of tree: " + diameter(root));
        }
    }
}
