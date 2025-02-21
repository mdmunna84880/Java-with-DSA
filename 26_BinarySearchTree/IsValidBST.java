public class IsValidBST {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static boolean isValid(Node root, Node min, Node max) {
        // Base case: If the current node is null, it's a valid subtree (empty subtree
        // is valid)
        if (root == null) {
            return true;
        }

        // Check if current node's data is less than or equal to the allowed minimum
        // (invalid BST)
        if (min != null && root.data <= min.data) {
            return false;
        }
        // Check if current node's data is greater than or equal to the allowed maximum
        // (invalid BST)
        if (max != null && root.data >= max.data) {
            return false;
        }
        // Recursively check the left and right subtrees:
        // - Left subtree should have values < current node's data (hence 'root' becomes
        // 'max' for left subtree)
        // - Right subtree should have values > current node's data (hence 'root'
        // becomes 'min' for right subtree)
        return isValid(root.left, min, root) && isValid(root.right, root, max);
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

        root.right.right.right = new Node(18); // Right child of 17

        if (isValid(root, null, null)) {
            System.out.println("The tree is a valid BST");
        } else {
            System.out.println("The tree is not a valid BST");
        }
    }
}
