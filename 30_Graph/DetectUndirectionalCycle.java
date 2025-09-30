import java.util.*;

public class DetectUndirectionalCycle {
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
        graph[0].add(new Edge(0, 3, 1));

        graph[1].add(new Edge(1, 0, 1));
        // graph[1].add(new Edge(1, 2, 1));
        
        graph[2].add(new Edge(2, 0, 1));
        // graph[2].add(new Edge(2, 1, 1));
        
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 3, 1));
    }

    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!vis[i]) {
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int parr){
        vis[curr] = true;
        for(Edge e : graph[curr]){
            int dest = e.dest;
            if(!vis[dest]){
                if(detectCycleUtil(graph, vis, dest, curr)){
                    return true;
                }
            } else if(dest!=parr) {
                return true;
            }
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
