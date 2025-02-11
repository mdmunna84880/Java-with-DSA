import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int capacity = 50;
        
        // Calculate the ratio of value to weight for each item
        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][1] = (double) value[i] / weight[i];
            ratio[i][0] = (double)i;
        }
        
        // Sort the ratio array in descending order
        Arrays.sort(ratio, Comparator.comparingDouble(arr -> arr[1]));
        
        // Initialize the final value to 0
        int finalVal = 0;

        // Start from the highest ratio and add items to the knapsack until the capacity is exhausted
        for(int i = ratio.length-1; i >= 0; i--) {
            // Get the index of the item in the original arrays (value and weight)
            int idx = (int)ratio[i][0];

            // Add the item if it will not exceed the capacity
            if(weight[idx] <= capacity) {
                capacity = capacity - weight[idx];
                finalVal += value[idx];
            } else {// Add the fraction of the item that can be added
                finalVal += capacity * ratio[i][1];
                capacity = 0;
                break;
            }
        }

        System.out.println("The maximum value that can be obtained is: " + finalVal);
    }

}
