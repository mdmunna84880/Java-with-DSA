public class KthAncestor {
    static class Node {
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }
    public static int kthAncestor(Node root, int k, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = kthAncestor(root.left, k, n);
        int right = kthAncestor(root.right, k, n);
        if(left == -1 && right == -1){
            return -1;
            
        }
        int dist = Math.max(left, right)+1;
        if(k == dist){
            System.out.println("Kth Ancestor: "+root.data);
        }
        return dist;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kthAncestor(root, 1, 6);
    }
}
