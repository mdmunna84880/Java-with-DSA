import java.util.ArrayList;

public class BridgeTarjanAlgo {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));
        
        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));
    }

    public static void dfs(ArrayList<Edge>[] graph, int[] dt, int[] low, boolean[] vis, int curr, int parr, int time){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(Edge e : graph[curr]){
            int neigh = e.dest;
            if(parr == neigh){
                continue;
            }else if(!vis[neigh]){
                dfs(graph, dt, low, vis, neigh, curr, time);
                low[curr] = Math.min(low[curr], low[neigh]);
                if(dt[curr] < low[neigh]){
                    System.out.println("Bridge: "+curr+"-----"+neigh);
                }
            }else{
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }

    }

    public static void bridgeTarjan(ArrayList<Edge>[] graph, int V){
        boolean[] vis = new boolean[V];
        int[] dt = new int[V];
        int[] low = new int[V];
        int time = 0;

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(graph, dt, low, vis, i, -1, time);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        bridgeTarjan(graph, V);
    }
}
