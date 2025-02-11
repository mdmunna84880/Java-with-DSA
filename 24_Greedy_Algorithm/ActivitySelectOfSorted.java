import java.util.ArrayList;

public class ActivitySelectOfSorted {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8 };
        int[] end = { 2, 4, 6, 7, 9 };
        ArrayList<Integer> result = new ArrayList<Integer>();

        // ? First activity
        int maxAct = 1;
        result.add(0);
        int lastAct = end[0];
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastAct) {
                maxAct++;
                result.add(i);
                lastAct = end[i];
            }
        }

        System.out.println("Maximum number of activities that can be performed are: " + maxAct);
        System.out.println("Activities are:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println("A" + result.get(i));
        }
    }
}
