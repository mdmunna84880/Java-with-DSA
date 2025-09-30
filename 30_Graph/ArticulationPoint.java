import java.util.*;

public class ArticulationPoint {
    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
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

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int parr, int time, int[] desc, int[] lowDesc, boolean[] ap, boolean[] vis){
        vis[curr] = true;
        desc[curr] = lowDesc[curr] = ++time;
        int children = 0;
        for(Edge e : graph[curr]){
            int dest = e.dest;
            if(parr == dest){
                continue;
            }else if(vis[dest]){
                lowDesc[curr] = Math.min(lowDesc[curr], desc[dest]);
            }else{
                dfs(graph, dest, curr, time, desc, lowDesc, ap, vis);
                lowDesc[curr] = Math.min(lowDesc[curr], lowDesc[dest]);
                if(parr != -1 && lowDesc[dest] >= desc[curr]){
                    ap[curr] = true;
                }
                children++;                
            }
        }
        if(parr == -1 && children > 1){
            ap[curr] = true;
        }
    }

    public static void getAP(ArrayList<Edge>[] graph, int V){
        boolean[] visited = new boolean[V];
        boolean[] ap = new boolean[V];
        int[] desc = new int[V];
        int[] lowDesc = new int[V];
        int time = 0;

        for(int i = 0; i < V; i++){
            if(!visited[i]){
                dfs(graph, i, -1, time, desc, lowDesc, ap, visited);
            }
        }
        System.out.println("Following are the AP vertices:");
        for(int i = 0; i < V; i++){
            if(ap[i]){
                System.out.println("V: "+i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);
    }

}
