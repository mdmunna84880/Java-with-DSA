public class MinDisNodes {
    static class Node{
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }
    public static Node lca(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if(right == null){
            return left;
        }
        if(left == null){
            return right;
        }
        return root;
    }

    public static int dis(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = dis(root.left, n);
        int right = dis(root.right, n);
        if(left == -1 && right == -1){
            return -1;
        }else if(left == -1){
            return right + 1;
        }else{
            return left + 1;
        }
    }
        

    public static int minDisNodes(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);
        return dis(lca, n1) + dis(lca, n2);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(minDisNodes(root, 4, 7));
    }
}
