public class FindSubArrays {
    public static void subArrays(String str, StringBuilder sb, int i){
        if(str.length() == i){
            System.out.println(sb);
            return;
        }
        //? For yes
        subArrays(str, sb.append(str.charAt(i)), i+1);
        sb.deleteCharAt(sb.length()-1);                
        // ? For no
        subArrays(str, sb, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subArrays(str, new StringBuilder(""), 0);
    }
}
