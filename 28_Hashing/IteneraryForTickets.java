import java.util.*;
public class IteneraryForTickets {
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revTickets = new HashMap<String, String>();
        String key = null;
        for(String t : tickets.keySet()){
            revTickets.put(tickets.get(t), t);
        }
        for(String t : tickets.keySet()){
            if(!revTickets.containsKey(t)){
                key = t;
                break;
            }
        }
        return key;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<String, String>();
        tickets.put("Chennai", "Bengeluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        while(tickets.containsKey(start)){
            String next = tickets.get(start);
            System.out.print(" -> "+next);
            start = next;
        }
    }
}
