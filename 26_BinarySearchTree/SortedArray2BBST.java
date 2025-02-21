public class SortedArray2BBST {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    public static Node converBBST(Node root, int arr[], int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        root = new Node(arr[mid]);
        root.left = converBBST(root, arr, start, mid-1);
        root.right = converBBST(root, arr, mid + 1, end);
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        Node root = null;
        root = converBBST(root, arr, 0, n-1);
        preOrder(root);
        
    }
}