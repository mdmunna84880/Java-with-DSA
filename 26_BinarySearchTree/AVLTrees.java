public class AVLTrees {
    static class Node {
        int data, height;
        Node left, right;

        Node(int item) {
            data = item;
            height = 1;
            left = right = null;
        }
    }

    static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public static int bf(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public static Node leftRotate(Node root) {
        Node y = root.right;
        Node T2 = y.left;

        y.left = root;
        root.right = T2;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    public static Node rightRotate(Node root) {
        Node y = root.left;
        Node T2 = y.right;
        y.right = root;
        root.left = T2;
        root.height = 1 + Math.max(height(root.left), height(root.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (root.data > key) {
            root.left = insert(root.left, key);
        } else if (root.data < key) {
            root.right = insert(root.right, key);
        } else {
            return root; // Ignore the item provided that is a dubplicate
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balanceFactor = bf(root);

        // left left case
        if (balanceFactor > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // right right case
        if (balanceFactor < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // left right case
        if (balanceFactor > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // right left case
        if (balanceFactor < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

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
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        preOrder(root);
    }
}
