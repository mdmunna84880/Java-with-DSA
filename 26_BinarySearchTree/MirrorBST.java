public class MirrorBST {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static Node mirror(Node root) {
        if (root == null) {
            return root;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(15);

        root.left.left = new Node(5);
        root.left.right = new Node(10);
        root.right.left = new Node(13);
        root.right.right = new Node(17);

        root.left.left.left = new Node(3);
        root.left.left.right = new Node(6);
        root.left.right.right = new Node(11);

        root.right.right.right = new Node(18);
        System.out.println("Original tree:");
        preOrder(root);
        System.out.println();
        root = mirror(root);
        System.out.println("Mirror tree:");
        preOrder(root);
    }
}
