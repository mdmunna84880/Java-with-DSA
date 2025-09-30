import java.util.*;

public class HasPath {
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
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[0].add(new Edge(1, 0, 1));
        graph[0].add(new Edge(1, 3, 1));
        
        graph[0].add(new Edge(2, 0, 1));
        graph[0].add(new Edge(2, 4, 1));
        
        graph[0].add(new Edge(3, 1, 1));
        graph[0].add(new Edge(3, 4, 1));
        graph[0].add(new Edge(3, 5, 1));

        graph[0].add(new Edge(4, 2, 1));
        graph[0].add(new Edge(4, 3, 1));

        graph[0].add(new Edge(5, 3, 1));
        graph[0].add(new Edge(5, 6, 1));

        graph[0].add(new Edge(6, 5, 1));
    }
    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dst, boolean vis[]) {
        if(src == dst){
            return true;
        }
        vis[src] = true;
        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dst, vis)){
                return true;
            }
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
         int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(hasPath(graph, 0, 9, new boolean[V]));
    }
}
