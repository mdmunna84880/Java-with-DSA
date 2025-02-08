public class Assignment2 {
    // ? Character for Number like 0 and 1 for nothing and 2 for abc, 3 for def ..........
    static char L[][] = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
    
    // ? Check wheather the string is not null and call to other function if not null to combine letter and print
    public static void letterCombination(String str) {
        int len = str.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        combine(str, new StringBuilder(""), len, 0);
    }

    // ? Combine letter and print
    public static void combine(String str, StringBuilder sb, int len, int indx) {
        if (indx == len) {
            System.out.println(sb.toString());
            return;
        }
        char[] letter = L[Character.getNumericValue(str.charAt(indx))];
        for(int i = 0; i < letter.length; i++){
            combine(str, new StringBuilder(sb).append(letter[i]), len, indx+1);
        }
    }

    public static void main(String[] args) {
        letterCombination("23");
    }
}
