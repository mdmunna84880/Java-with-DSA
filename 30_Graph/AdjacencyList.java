import java.util.ArrayList;

public class AdjacencyList {
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

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        
        for (int i = 0; i < V; ++i){
            graph[i] = new ArrayList<>();
        }

        // O-Vertices
        graph[0].add(new Edge(0, 1, 5));
        // 1-Vertices
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        // 2-Vertices
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        // 3-Vertices
        graph[3].add(new Edge(4, 2, 2));

        for(int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println("Edge from " + e.src + " to " + e.dest + "");
        }
    }
}