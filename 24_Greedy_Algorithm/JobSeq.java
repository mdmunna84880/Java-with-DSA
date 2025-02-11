import java.util.*;

public class JobSeq {

    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int deadline, int profit, int id) {
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        int[][] jobProfit = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobProfit.length; i++) {
            jobs.add(new Job(jobProfit[i][0], jobProfit[i][1], i));
        }
        // Sorting jobs based on profit in descending order
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Character> result = new ArrayList<>();
        int maxDeadline = 0;
        for(int i = 0; i < jobs.size(); i++) {
            Job currJob = jobs.get(i);
            if (currJob.deadline > maxDeadline) {
                maxDeadline++;
                result.add((char) (currJob.id + 65));      
            }
        }

        System.out.println("Jobs sequence: " + result);
        System.out.println("Maximum deadline: " + maxDeadline);
    }
}
