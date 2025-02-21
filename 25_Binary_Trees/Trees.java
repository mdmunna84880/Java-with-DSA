import java.util.*;

public class Trees {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BuildTree {
        static int idx = -1;

        public static Node buildTree(int[] items) {
            idx++;
            if (items[idx] == -1) {
                return null;
            }
            Node newNode = new Node(items[idx]);
            newNode.left = buildTree(items);
            newNode.right = buildTree(items);
            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                // System.out.print(-1+" ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                // System.out.print(-1+" ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node temp = q.remove();
                if (temp == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else {
                        q.add(null);
                    }
                } else {
                    System.out.print(temp.data + " ");
                    if (temp.left != null) {
                        q.add(temp.left);
                    }

                    if (temp.right != null) {
                        q.add(temp.right);
                    }

                }
            }
        }
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            return Math.max(left, right) + 1;
        }

    }

    public static void main(String[] args) {
        int[] items = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BuildTree.buildTree(items);
        BuildTree.levelOrder(root);
        // System.out.println("Height: " + BuildTree.height(root));
    }
}