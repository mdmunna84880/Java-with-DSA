import java.util.*;
public class DetectUnidirectionCycle {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 0, 1));
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        int v = graph.length;
        boolean visited[] = new boolean[v];
        boolean recStack[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if(!visited[i]){
                if(detectCycleUtil(graph, visited, recStack, i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean visited[], boolean recStack[], int curr) {
        visited[curr] = true;
        recStack[curr] = true;
        for (Edge edge : graph[curr]) {
            int dest = edge.dest;
            if(recStack[dest] == true){
                return true;
            }
            if(!visited[dest] && detectCycleUtil(graph, visited, recStack, dest)){
                return true;
            }
        }
        recStack[curr] = false;
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(detectCycle(graph)? "Graph contains cycle" : "Graph doesn't contain cycle");
    }
}
