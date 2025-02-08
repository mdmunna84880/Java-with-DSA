public class Assignment1 {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void print(Node head){
        while (head != null) {
            System.out.print(head.data+" ->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node getInterSectionNode(Node head1, Node head2){
       while (head1 != null) {
            Node temp = head2;
            while (temp != null) {
                if(head1 == temp){
                    return temp;
                }
                temp = temp.next;
            }
            head1 = head1.next;
       }
       return null;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(6);
        head1.next.next.next.next = new Node(7);
        print(head1);
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = head1.next.next.next;
        print(head2);
        Node interSection = getInterSectionNode(head1, head2);
        if(interSection == null){
            System.out.println("Intersection is not found");
        }else{
            System.out.println("Intersection is fount at"+interSection);
        }

    }
}
