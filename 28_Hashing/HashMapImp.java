import java.util.*;
public class HashMapImp{

    public static void main(String[] args) {
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Burger", 10);
        menu.put("Pizza", 15);
        menu.put("Fries", 5);
        menu.put("Salad", 8);
        System.out.println(menu);
        System.out.println(menu.size());
        System.out.println(menu.containsKey("Salad"));
        System.out.println(menu.get("Pizza"));
        System.out.println(menu.remove("Pizza"));
        System.out.println(menu);
        Set<String> keys = menu.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + menu.get(key));
        }
    }
}