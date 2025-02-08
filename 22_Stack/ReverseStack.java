import java.util.*;
public class ReverseStack {
    // ? Push at bottom
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // ? Reverse stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        // ?Poping out the top element
        int top = s.pop();
        reverseStack(s);

        // ? Push at bottom
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            int top = s.pop();
            System.out.println(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);

    }
}
