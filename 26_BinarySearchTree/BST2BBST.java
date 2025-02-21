import java.util.*;
public class BST2BBST {
    static class Node {
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        inorder(root.left, inorder);
        inorder.add(root.data);
        inorder(root.right, inorder);
    }
    public static Node convertBBST(ArrayList<Integer> inorder, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = convertBBST(inorder, start, mid-1);
        root.right = convertBBST(inorder, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(7);
        root.left.left = new Node(6);
        root.left.left.left = new Node(5);
        root.left.left.left.left = new Node(4);
        root.left.left.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root.right.right.right.right = new Node(13);
        preOrder(root);
        System.out.println();
        ArrayList<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        System.out.println(inorder);
        root = convertBBST(inorder, 0, inorder.size()-1);
        preOrder(root);
    }
}
