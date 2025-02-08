import java.util.Scanner;
import java.util.Set;

public class Assignment1 {
    public static int countLowerCaseVowels(String str){
        // String vowels = "aeiou";
        int count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for(int i = 0; i < str.length(); i++){
            // if (vowels.indexOf(str.charAt(i)) != -1) {
            //     count++;
            // }
            if(vowels.contains(str.charAt(i))){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        System.out.println(countLowerCaseVowels(str));
        sc.close();
    }
}
