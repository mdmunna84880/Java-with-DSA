import java.util.Arrays;

public class Assignment4 {
    public static void anagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()){
            char str1Char[] = str1.toCharArray();
            char str2Char[] = str2.toCharArray();
            Arrays.sort(str1Char);
            Arrays.sort(str2Char);
            boolean result = Arrays.equals(str1Char, str2Char);
            if(result){
                System.out.println("The "+str1+" and "+str2+" are anagrams of each other");
            }else{
                System.out.println("The "+str1+" and "+str2+" are not anagrams of each other");
            }
        }else{
            System.out.println("The Strings length is not equal");
        }
        

    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        anagrams(str1, str2);
    }
}
