public class BuilTree {
    static class Node{
        int data;
        Node left;
        Node right;
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

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    public static Node deleteNode(Node root, int value){
        if(root == null){
            return null;
        }
        if(root.data > value){
            root.left = deleteNode(root.left, value);
        }else if(root.data < value){
            root.right = deleteNode(root.right, value);
        }else{
            // Delete the leaf node from the tree
            if(root.left == null && root.right == null){
                return null;
            }
            // Delete the node with one child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // Delete the node with two child
            Node succ = getSuccessor(root.right);
            root.data = succ.data;
            root.right = deleteNode(root.right, succ.data);
        }
        return root;                
    }

    public static Node getSuccessor(Node root){
        Node curr = root;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < value.length; i++){
            root = buildBST(root, value[i]);
        }
        inorder(root);
        root = deleteNode(root, 5);
        System.out.println();
        inorder(root);
    }
}