import java.util.*;

public class ActivitySelectection {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8 };
        int[] end = { 2, 4, 6, 7, 9 };
        int[][] activities = new int[start.length][3];

        // ? Create a 2D array to store the activities with their start and end time
        for(int i = 0; i < end.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // ? Sort the activities based on their end time
        Arrays.sort(activities, Comparator.comparingInt(o->o[2]));

        ArrayList<Integer> result = new ArrayList<Integer>();
        int maxActivity = 1;
        result.add(activities[0][0]);
        int lastActivity = activities[0][2];
        
        // ? Find the maximum number of activities that can be done within the given time slots
        for(int i = 1; i < activities.length; i++){
            if(activities[i][1] >= lastActivity){
                maxActivity++;
                result.add(activities[i][0]);
                lastActivity = activities[i][2];
            }
        }

        System.out.println("Maximum number of activities that can be done: " + maxActivity);
        System.out.println("Activities are:");
        for(int i = 0; i < result.size(); i++){
            System.out.println("A" + result.get(i));
        }
    }
}
