import java.util.*;

public class KthLevelTree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void kthLevel(Node root, int level, int k) {
        if (root == null)
            return;
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }

    static class Info {
        int level;
        Node node;

        Info(int level, Node node) {
            this.level = level;
            this.node = node;
        }
    }

    public static void kthLevelIterator(Node root) {
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(1, root));
        int k = 3;
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.level == k) {
                System.out.print(curr.node.data + " ");
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.level + 1, curr.node.left));
            }
            if (curr.node.right != null) {
                q.add(new Info(curr.level + 1, curr.node.right));
            }

        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kthLevel(root, 1, 3);
        System.out.println();
        kthLevelIterator(root);
    }
}