import java.util.*;

public class CheapestFlightsLessStops {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.weight = wt;
        }
    }
    public static void createGraph(int[][] arr, ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] e : arr){
            int src = e[0];
            int dest = e[1];
            int weight = e[2];
            graph[src].add(new Edge(src, dest, weight));
        }
    }
    static class Info{
        int v, costs, stops;
        public Info(int v, int c, int s){
            this.v = v;
            this.costs = c;
            this.stops = s;
        }
    }
    public static int getCost(ArrayList<Edge>[] graph, int src, int dest, int V, int k){
        int[] dist = new int[V];
        Arrays.fill(dist, 1, V, Integer.MAX_VALUE);
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr.stops > k){
                continue;
            }
            for(int i = 0; i < graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int v = e.dest;
                int wt = e.weight;
                if(curr.costs + wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.costs + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }
        return dist[dest] == Integer.MAX_VALUE? -1 : dist[dest];
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int[][] arr = { {0, 1, 1}, {0, 2, 2}, {1, 3, 100}, {2, 1, 1}, {2, 3, 50} };
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(arr,  graph);
        int src = 0, dest = 3, k = 2;
        int minCost = getCost(graph, src, dest, V, k);
        System.out.println("Minimum cost is " + minCost);
    }
}
