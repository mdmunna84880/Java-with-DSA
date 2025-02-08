
public class LinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        if(temp == null){
            System.out.println("LinkedList is null");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    public void addInMiddle(int data, int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; 
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int value = head.data;
            head = head.next;
            size = 0;
            return value;
        }

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int value = head.data;
            head = tail = head.next;
            size = 0;
            return value;
        }
        Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }

        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;  
        return value;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){

        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);

        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteFromNthNode(int n){
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if(size == n){
            head = head.next;
        }

        Node prev = head;
        int i = 1;
        int iToFind = size-n;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean checkPalindrome(){
        // ? For head is null or one node
        if(head == null || head.next == null){
            return true;
        }

        // ? Finding mid node
        Node mid = findMid(head);

        // ? Reversing right part
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // ? Comparing palidrome
        while (right != null) {
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
    public static void removeCycle(){
        // ? Detect cycle
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }

        if(isCycle == false){
            return;
        }

        // ? Finding Last node
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // ? Breaking cycle from the last node
        prev.next = null;

    }

    // ? Merge Sort
    public static Node mergeSort(Node head){
        // ? Base case if we have no node or only one node then that is sorted
        if(head == null || head.next == null){
            return head;
        }

        // ? Finding mid node to divide every time
        Node midNode = getMidNode(head);

        // ? Dividing and sorting individual
        Node rightMid = midNode.next;
        midNode.next = null;
        Node letfHead = mergeSort(head);
        Node rightHead = mergeSort(rightMid);

        // ? Merging
        return merge(letfHead, rightHead);

    }

    // ? Finding mid node
    private static Node getMidNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    // ? Zig-Zag Linked List
    public void zigZag(){
        // ? Find Middle Node
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node midNode = slow;

        // ? Reverse 2nd Halfs
        Node prev = null;
        Node curr = midNode.next;
        midNode.next = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // ? Alternate merging=>Zig-Zag
        Node rightH = prev;
        Node leftH = head;
        Node nextR, nextL;
        while (rightH != null && leftH != null) {
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;
            rightH = nextR;
            leftH = nextL;
        }
        
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}