public class DoublyLinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ? Print Doubly Linked List
    public void printDL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" <=> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    // ? Add node from First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // ? Add node from Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // ? Remove from the First
    public int removeFirst(){
        if(head == null){
            System.out.println("Node does not exist");
            return Integer.MIN_VALUE;
        }

        size--;
        if(head.next == null){
            int value = head.data;
            head = tail = null;
            return value;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        return value;
    }

    // ? Remove node from last
    public int removeLast(){
        if(head == null){
            System.out.println("Node does not exist");
            return Integer.MIN_VALUE;
        }

        size--;
        if(head.next == null){
            int value = head.data;
            head = tail = null;
            return value;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.addFirst(5);
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        // dl.printDL();
        dl.addLast(6);
        dl.printDL();
        dl.reverse();
        dl.printDL();

    }
}
