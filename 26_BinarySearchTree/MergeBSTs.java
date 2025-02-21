import java.util.*;
public class MergeBSTs {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null) return;
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node convertBBST(ArrayList<Integer> arr, int s, int e){
        if(s > e) return null;
        int mid = (s + e +1) / 2;
        Node root = new Node(arr.get(mid));
        root.left = convertBBST(arr, s, mid - 1);
        root.right = convertBBST(arr, mid + 1, e);
        return root;
    }
    public static Node mergeBSTs(Node left, Node right) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        getInorder(left, list1);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        getInorder(right, list2);
        int i = 0, j = 0;
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        while (i < list1.size() && j < list2.size()) {
            if(list1.get(i) > list2.get(j)) {
                finalList.add(list2.get(j));
                j++;
            }else{
                finalList.add(list1.get(i));
                i++;
            }
        }
        while (i < list1.size()) {
            finalList.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            finalList.add(list2.get(j));
            j++;
        }
        return convertBBST(finalList, 0, finalList.size()-1);
    }
    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node mergedRoot = mergeBSTs(root1, root2);
        preOrder(mergedRoot);
    }
}
