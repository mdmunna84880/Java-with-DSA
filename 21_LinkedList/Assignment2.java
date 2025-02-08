public class Assignment2 {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data+" ->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void skipMdeleteN(int M, int N){
        Node temp = head, deletNode;
        int count;
        while (temp != null) {
            for(count = 1; count < M && temp != null; count++){
                temp = temp.next;
            }
            if(temp == null){
                return;
            }
            deletNode = temp.next;
            for(count = 1; count <= N && deletNode != null; count++){
                deletNode = deletNode.next;
            }
            temp.next = deletNode;
            temp = temp.next;

        }
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 8; i++){
            addLast(i);
        }
        print(head);
        skipMdeleteN(2, 2);
        print(head);
    }
}
