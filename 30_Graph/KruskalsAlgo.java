import java.util.*;
public class KruskalsAlgo {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
        
        @Override
        public int compareTo(Edge e) {
            return this.wt - e.wt;
        }
    }
    static int n = 4;
    static int[] parent = new int[n];
    static int[] rank = new int[n];
    public static void initialize(){
        for(int i=0;i<n;i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }
    public static int find(int x){
        if(parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }
    public static void union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);
        if(rank[xRoot] == rank[yRoot]){
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }else if(rank[xRoot] > rank[yRoot]){
            parent[yRoot] = xRoot;
        }else{
            parent[xRoot] = yRoot;
        }
    }
    public static void createGraph(ArrayList<Edge> graph){
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));

        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(1, 0, 10));

        graph.add(new Edge(2, 0, 15));
        graph.add(new Edge(2, 3, 50));

        graph.add(new Edge(3, 1, 40));
        graph.add(new Edge(3, 2, 50));
        graph.add(new Edge(3, 0, 30));

    }
    public static int kruskalsAlgo(ArrayList<Edge> graph, int V){
        initialize();
        Collections.sort(graph);
        int minCost = 0;
        int count = 0;
        for(int i = 0; count < V-1; i++){
            Edge e = graph.get(i);
            int x = find(e.src);
            int y = find(e.dest);
            if(x != y){
                union(x, y);
                minCost += e.wt;
                count++;
            }
        }
        return minCost;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph = new ArrayList<Edge>();        
        createGraph(graph);
        System.out.println(kruskalsAlgo(graph, V));
    }
}
