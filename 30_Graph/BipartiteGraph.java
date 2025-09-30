import java.util.*;

public class BipartiteGraph {
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

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        
        graph[3].add(new Edge(3, 1, 1));
        // graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 2, 1));
        // graph[4].add(new Edge(4, 3, 1));
    }
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int v = graph.length;
        int[]  colors = new int[v];
        for(int i = 0; i < v; i++){
            colors[i] = -1;
        }
        for(int i = 0; i < v; i++){
            if(colors[i] == -1){
                if(!isBipartiteUtil(graph, i, colors)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isBipartiteUtil(ArrayList<Edge>[] graph, int i, int[] colors){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(i);
        colors[i] = 0;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(Edge edge : graph[curr]){
                int dest = edge.dest;
                if(colors[dest] == -1){
                    colors[dest] = colors[curr] == 1 ? 0 : 1;
                    q.add(dest);
                }
                else if(colors[dest] == colors[curr]){
                    return false;
                }
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph)? "Yes" : "No");
    }
}
