import java.util.*;
public class UniouIntersection {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> unioun = new HashSet<Integer>();
        HashSet<Integer> intersection = new HashSet<Integer>();

        //Unioun
        for (int num : arr1) {
            unioun.add(num);
        }
        for (int num : arr2) {
            unioun.add(num);
        }

        //Intersection
        int count = 0;
        HashSet<Integer> realInter = new HashSet<Integer>();
        for (int num : arr1) {
            intersection.add(num);
        }

        for (int num : arr2) {
            if (intersection.contains(num)) {
                count++;
                realInter.add(num);
                intersection.remove(num);
            }
        }
        System.out.println("Union: " + unioun);
        System.out.println("Union: " +unioun.size());
        System.out.println("Intersection: " + realInter);
        System.out.println("Count of common elements: " + count);
    }
}
