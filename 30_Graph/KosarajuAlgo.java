import java.util.*;

public class KosarajuAlgo {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s){
        vis[curr] = true;
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        vis[curr] = true;
        System.out.print(curr + " ");
        for(Edge e : graph[curr]){
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void kosarajuAlgo(ArrayList<Edge>[] graph){
        // ? Step-1
        int V = graph.length;
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                topSort(graph, i, vis, s);
            }
        }

        // ? Step-2
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for(int i = 0; i < V; i++){
            vis[i] = false;
            transpose[i] = new ArrayList<>();
        }
        for(int i = 0; i < V; i++){
            for(Edge e : graph[i]){
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // ? Step-3
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                System.out.print("SSC -> ");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        kosarajuAlgo(graph);
    }
}
