import java.util.*;;
public class LowestCommonAncestor{
    static class Node{
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }

        if(getPath(root.left, n, path) || getPath(root.right, n, path)){
            return true;
        }

        path.remove(path.size() - 1);
        return false;        
    }

    public static Node lcaNode(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if(!getPath(root, n1, path1) || !getPath(root, n2, path2)){
            return null;
        }
        int i = 0;
        while(i < path1.size() && i < path2.size()){
            if(path1.get(i) != path2.get(i)){
                break;
            }
            i++;
        }
        return path1.get(i - 1);
    }

    public static Node laNode1(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node left = laNode1(root.left, n1, n2);
        Node right = laNode1(root.right, n1, n2);
        if(right == null){
            return left;
        }
        if(left == null){
            return right;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node lca = laNode1(root, 4, 7);
        System.out.println(lca.data);

        // if(lcaNode(root, 9, 5)== null){
        //     System.out.println("Nodes not found");
        // }else{
        //     System.out.println("LCA of 9 and 5 is " + lcaNode(root, 9, 5).data);
        // }
    }
}