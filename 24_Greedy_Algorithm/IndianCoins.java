import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        int amount = 590;

        // Sort the coins in descending order
        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();// To store the coins used
        //Count the number of coins used
        int countOfCoins = 0;
        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {// Get the number of coins
                amount -= coins[i];// Reduce the amount to the number of coins
                countOfCoins++;
                result.add(coins[i]);// Add the coin to the result
            }
            if (amount == 0) {// Break the loop if the amount is 0
                break;
            }
        }
        System.out.println("Number of coins: " + countOfCoins);
        System.out.println("Coins used: " + result);
    }
}