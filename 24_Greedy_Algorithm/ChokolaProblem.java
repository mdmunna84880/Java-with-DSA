import java.util.*;

public class ChokolaProblem {
    public static void main(String[] args) {
        Integer hCost[] = { 4, 1, 2 };
        Integer vCost[] = { 2, 1, 3, 1, 4 };

        Arrays.sort(hCost, Collections.reverseOrder());
        Arrays.sort(vCost, Collections.reverseOrder());

        int minCost = 0;
        int hp = 1, vp = 1, v = 0, h = 0;

        // Calculate the minimum cost by alternately choosing the cheaper piece
        while (h < hCost.length && v < vCost.length) {
            if (hCost[h] <= vCost[v]) {
                minCost += vCost[v] * hp;
                v++;
                vp++;
            } else {
                minCost += hCost[h] * vp;
                h++;
                hp++;
            }
        }

        // If horizontal pieces is still remaining
        while (h < hCost.length) {
            minCost += hCost[h] * vp;
            h++;
            hp++;
        }

        // If vertical pieces is still remaining
        while (v < vCost.length) {
            minCost += vCost[v] * hp;
            v++;
            vp++;
        }
        System.out.println("Minimum cost: " + minCost);
    }
}
