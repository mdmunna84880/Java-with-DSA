import java.util.Stack;

public class DuplicateParentheses {
    // ? Checking duplicate parentheses
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // ? Closing
            if(ch == ')'){
                int count = 0;
                while (s.pop() != '(') {//? Stop when s.pop() will be opening
                    count++;
                }
                if(count < 1){
                    return true;//? Duplicate
                }
            }else{
                s.push(ch);//? Pushing everything except opening parentheses
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a)+(v)+((a+b)))";
        System.out.println(isDuplicate(str));
    }
}
