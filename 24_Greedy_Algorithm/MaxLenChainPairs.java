import java.util.*;

public class MaxLenChainPairs {
    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 }, { 39, 60 }, { 15, 28 }, { 27, 40 }, { 50, 90 } };
        // Sort the pairs based on the end time of each pair
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        int maxChain = 1;
        int lastPair = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            // If the current pair starts after the last pair ends, consider it for the chain.
            if (pairs[i][0] >= lastPair) {
                maxChain++;
                lastPair = pairs[i][1];
            }
        }
        System.out.println("Maximum length of chain pairs: " + maxChain);
    }
}
