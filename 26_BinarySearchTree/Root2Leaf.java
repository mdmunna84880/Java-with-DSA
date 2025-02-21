import java.util.*;
public class Root2Leaf {
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

    public static void printPath(ArrayList<Node> path){
        for(int i  = 0; i < path.size(); i++){
            System.out.print(path.get(i).data + " ");
        }
        System.out.println();

    }
    public static void root2Leaf(Node root, ArrayList<Node> path){
        if(root == null){
            return;
        }
        path.add(root);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        root2Leaf(root.left, path);
        root2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        int value[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < value.length; i++){
            root = buildBST(root, value[i]);
        }
        ArrayList<Node> path = new ArrayList<Node>();
        root2Leaf(root, path);
    }
}
