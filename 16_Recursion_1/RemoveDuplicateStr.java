public class RemoveDuplicateStr {
    public static void removeDuplicateChar(String str, StringBuilder sb, boolean map[], int indx){
        if(str.length() == indx){
            System.out.println(sb);
            return;
        }
        char curChar = str.charAt(indx);
        if(map[curChar-'a'] == true){
            removeDuplicateChar(str, sb, map, indx+1);
        }else{
            map[curChar-'a'] = true;
            removeDuplicateChar(str, sb.append(curChar), map, indx+1);
        }
    }
    public static void main(String[] args) {
        String str= "appnacollege";
        System.out.println('p'-'a');
        removeDuplicateChar(str, new StringBuilder(""), new boolean [26], 0);
    }
}
