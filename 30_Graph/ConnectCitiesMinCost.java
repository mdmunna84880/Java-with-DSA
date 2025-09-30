import java.util.PriorityQueue;

public class ConnectCitiesMinCost {
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;
        
        public Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static int citiesMinCost(int[][] cities) {
        int n = cities.length;
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        boolean[] visited = new boolean[n];

        pq.add(new Edge(0, 0));
        int minCost = 0;
        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!visited[curr.dest]) {
                visited[curr.dest] = true;
                minCost += curr.cost;
                for(int i = 0; i < cities[curr.dest].length; i++) {
                    if(cities[curr.dest][i] != 0) {
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                    
               }
            }
        }
        return minCost;
    }
    public static void main(String[] args) {
        int[][] cities = {{0, 1, 2, 3, 4}, {1, 0, 5, 0, 7}, {2, 5, 0, 6, 0}, {3, 0, 6, 0, 0}, {4, 7, 0, 0, 0}};
        System.out.println(citiesMinCost(cities));
    
    }
}
