import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch)-1);
                if(freq.get(ch) == 0){
                    freq.remove(ch);
                }
            } else {
                return false;
            }
        }

        return freq.isEmpty();
    }
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s, t)); // false
    }
}
