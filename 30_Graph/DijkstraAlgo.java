import java.util.*;
public class DijkstraAlgo {
    static class Edge{
        int src;
        int dest;
        int wt;
        
        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static class Pair implements Comparable<Pair>{
        int vertex;
        int path;
        
        public Pair(int vertex, int path) {
            this.vertex = vertex;
            this.path = path;
        }
        
        @Override
        public int compareTo(Pair o) {
            return this.path - o.path;
        }
    }
    public static void shortestPath(ArrayList<Edge>[] graph){
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        Arrays.fill(dist, 1, V, Integer.MAX_VALUE);
        // dist[0] = 0;
        pq.add(new Pair(0, 0));
        
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            int u = p.vertex;
            int d = p.path;
            if(!visited[u]){
                visited[u] = true;
                for(Edge e : graph[u]){
                    int v = e.dest;
                    int weight = e.wt;
                    if(dist[v] > d + weight){
                        dist[v] = d + weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }            
        }
        
        System.out.println("Vertex\tDistance from Source");
        for(int i = 0; i < V; i++){
            System.out.println(i + "\t" + dist[i]);
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        shortestPath(graph);
    }
}
