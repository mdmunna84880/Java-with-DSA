public class OptimizedDiaNodes {
    static class Node{
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }

    static class Info{
        int dia, height;
        Info(int dia, int height){
            this.dia = dia;
            this.height = height;
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

        public static Info diaOfNode(Node root){
            if(root == null){
                return new Info(0, 0);
            }
            Info leftInfo = diaOfNode(root.left);
            Info rightInfo = diaOfNode(root.right);
            int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.height + rightInfo.height + 1);
            int height = Math.max(leftInfo.height, rightInfo.height) + 1;
            return new Info(dia, height);
        }
    }
    
    public static void main(String[] args) {
        int[] items = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BuildTree.buildTree(items);
        System.out.println("Diameter of tree: " + BuildTree.diaOfNode(root).dia);
    }
}
