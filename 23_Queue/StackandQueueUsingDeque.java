import java.util.*;

public class StackandQueueUsingDeque {
    static class MyStack {
        Deque<Integer> dq = new LinkedList<>();

        public void push(int x) {
            dq.addLast(x);
        }

        public int pop() {
            if (dq.isEmpty()) {
                return -1;
            }
            return dq.removeLast();
        }

        public int peek() {
            if (dq.isEmpty()) {
                return -1;
            }
            return dq.peekLast();
        }

        public boolean isEmpty() {
            return dq.isEmpty();
        }
    }

    static class MyQueue {
        Deque<Integer> dq = new LinkedList<>();

        public void add(int x) {
            dq.addLast(x);
        }
        public int remove() {
            if (dq.isEmpty()) {
                return -1;
            }
            return dq.removeFirst();
        }
        public int peek() {
            if (dq.isEmpty()) {
                return -1;
            }
            return dq.peekFirst();
        }
        public boolean isEmpty() {
            return dq.isEmpty();
        }
    }
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Stack elements are:");
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();            
        }
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Queue elements are:");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
