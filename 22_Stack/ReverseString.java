import java.util.Stack;

public class ReverseString {
    public static void reverseStr(String str){
        int idx = 0; 
        Stack<Character> s = new Stack<>();

        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result = result.append(s.peek());
            s.pop();
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        String str = "abc";
        reverseStr(str);
    }
}
