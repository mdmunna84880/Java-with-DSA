public class Assignment2 {
    public static String assignment(int n, StringBuilder sb){
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if(n == 0){
            return "";
        }
        assignment(n/10, sb);
        int lastDigit = n%10;
        sb.append(arr[lastDigit]).append(" ");
        return sb.toString();
    }
    public static void main(String[] args) {
        int n = 2019;
        System.out.println(assignment(n, new StringBuilder("")));
    }
}
