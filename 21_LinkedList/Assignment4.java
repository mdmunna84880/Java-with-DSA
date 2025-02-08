public class Assignment4 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head, tail, tempH, tempT;

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

    public static void evenNode(Node head2) {
        Node newNode = new Node(head2.data);
        if (tempH == null) {
            tempH = tempT = newNode;
            return;
        }
        tempT.next = newNode;
        tempT = newNode;
    }

    public static void firstEvenOdd() {
        if (head == null) {
            return;
        }
        Node curr = head, prev = null;
        while (curr != null) {
            if (curr.data % 2 != 0) {
                if (prev != null) {
                    prev.next = curr.next;
                }
                evenNode(curr);
                curr = curr.next;

            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        if (prev != null) {
            prev.next = tempH;
        }
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(3);
        addLast(5);
        addLast(7);
        // addLast(4);
        // addLast(6);
        // addLast(1);
        print(head);
        firstEvenOdd();
        print(tempH);
        print(head);
    }
}
