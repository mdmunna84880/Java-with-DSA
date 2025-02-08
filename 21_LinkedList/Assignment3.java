public class Assignment3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head, tail , size;

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void swap(int key1, int key2) {
        if(key1 == key2){
            return;
        }
        Node currX = head, prevX = null, currY = head, prevY = null;
        while (currX != null && currX.data != key1) {
            prevX = currX;
            currX = currX.next;
        }
        while (currY != null && currY.data != key2) {
            prevY = currY;
            currY = currY.next;
        }

        // ? Key is not found
        if(currX == null || currY == null){
            return;
        }

        // ? Swapping node withot their next
        if(prevX != null){
            prevX.next = currY;
        }else{
            // ? Key is found at head
            head = currY;
        }
        if(prevY != null){
            prevY.next = currX;
        }else{
            // ? Key is found at head
            head = currX;
        }

        // ? Linking their next
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;       
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            addLast(i);
        }
        print(head);
        swap(2, 4);
        print(head);
    }
}
