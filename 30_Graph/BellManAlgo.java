import java.util.ArrayList;

public class BellManAlgo {
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
    // public static void createGraph(ArrayList<Edge>[] graph){
    //     for(int i = 0; i < graph.length; i++) {
    //         graph[i] = new ArrayList<>();
    //     }
    //     graph[0].add(new Edge(0, 1, 2));
    //     graph[0].add(new Edge(0, 2, 4));
    //     graph[1].add(new Edge(1, 2, -4));
    //     // graph[1].add(new Edge(1, 3, 7));
    //     graph[2].add(new Edge(2, 3, 2));
    //     graph[3].add(new Edge(3, 4, 4));
    //     graph[4].add(new Edge(4, 1, -1));
    //     // graph[4].add(new Edge(4, 5, 5));
    // }
    public static void createGraph2(ArrayList<Edge> graph){
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        // graph[1].add(new Edge(1, 3, 7));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
        // graph[4].add(new Edge(4, 5, 5));
    }
    // public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
    //     int[] dist = new int[V];
    //     for (int i = 0; i < V; i++){
    //         if(i != src){
    //             dist[i] = Integer.MAX_VALUE;
    //         }
    //     }
    //     dist[src] = 0;
    //     for (int i = 0; i < V - 1; i++) {
    //         for (int j = 0; j < graph.length; j++) {
    //             for (Edge e : graph[j]) {
    //                 int u = e.src, v = e.dest, wt = e.wt;
    //                 if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
    //                     dist[v] = dist[u] + wt;
    //                 } 
    //             }
    //         }
    //     }
    //     System.out.println("Vertex   Distance from Source");
    //     for (int i = 0; i < V; ++i)
    //     System.out.println(i+" \t\t "+ dist[i]);
        
    // }
    public static void bellmanFord2(ArrayList<Edge> graph, int src, int V) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        dist[src] = 0;
        for (int i = 0; i < V - 1; i++) {
                for (Edge e : graph) {
                    int u = e.src, v = e.dest, wt = e.wt;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    } 
                }
        }
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; ++i)
        System.out.println(i+" \t\t "+ dist[i]);
        
    }
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        // ArrayList<Edge> graph[] = new ArrayList[V];
        // createGraph(graph);
        // System.out.println("For Graph 1");
        // bellmanFord(graph, 0, V);
        
        ArrayList<Edge> graph2 = new ArrayList<>();
        createGraph2(graph2);
        System.out.println("\nFor Graph 2");
        bellmanFord2(graph2, 0, V);
    }
}
