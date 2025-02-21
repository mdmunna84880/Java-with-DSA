public class SumTree {
    static class Node{
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }

    public static int sumTree(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);
        int oldData = root.data;
        if(root.left == null || root.right == null){
            root.data = leftSum + rightSum;
            return oldData;
        }
        root.data = root.left.data + leftSum + root.right.data + rightSum;
        return oldData;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preOrder(root);
        sumTree(root);
        System.out.println();
        preOrder(root);
    }
}
