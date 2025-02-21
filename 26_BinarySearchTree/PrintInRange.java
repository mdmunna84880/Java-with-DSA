public class PrintInRange {
    static class Node{
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }

    public static Node buildBST(Node root, int value){
        if(root == null){
            return new Node(value);
        }
        if(value < root.data){
            root.left = buildBST(root.left, value);
        }else{
            root.right = buildBST(root.right, value);
        }
        return root;
    }
    
    public static void printInRange(Node root, int start, int end){
        if(root == null){
            return;
        }
        if(root.data > start && root.data <= end){
            printInRange(root.left, start, end);
            System.out.print(root.data + " ");
            printInRange(root.right, start, end);
        }else if(root.data <= start){
            printInRange(root.right, start, end);
        }else{
            printInRange(root.left, start, end);
        }
    }
    public static void main(String[] args) {
        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < value.length; i++){
            root = buildBST(root, value[i]);
        }
        printInRange(root, 5, 12);

    }
}
