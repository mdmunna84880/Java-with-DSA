import java.util.Stack;

public class StockSpan {

    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;
        for(int i = 1; i < stocks.length; i++){
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                // ? Span is index substracts previous high  
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for(int i = 0; i < span.length; i++){
            System.out.println(span[i]);
        }
    }
}
