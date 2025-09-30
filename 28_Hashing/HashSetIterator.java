import java.util.*;
public class HashSetIterator {
    public static void main(String[] args) {
        HashSet<String> country= new HashSet<String>();
        country.add("India");
        country.add("USA");
        Iterator<String> itr = country.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //Advance for loop
        for (String coutr : country){
            System.out.println(coutr);
        }
    }
}
