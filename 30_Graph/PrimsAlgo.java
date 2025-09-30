import java.util.*;

public class PrimsAlgo {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.weight = wt;
        }
    }
    public static void createGraph(int[][] arr, ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] e : arr){
            int src = e[0];
            int dest = e[1];
            int weight = e[2];
            graph[src].add(new Edge(src, dest, weight));
        }
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int w;

        public Pair(int v, int w){
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Pair o) {
            return this.w - o.w;
        }
    }
    public static void primsMST(ArrayList<Edge>[] graph){
        int V = graph.length;
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;
        HashSet<Integer> mst = new HashSet<>();
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            int cost = p.w;
            int node = p.v;
            if(!visited[node]){
                visited[node] = true;
                finalCost += cost;
                mst.add(node);
                for(Edge e : graph[node]){
                    int dest = e.dest;
                    int weight = e.weight;
                    if(!visited[dest]){
                        pq.add(new Pair(dest, weight));
                    }
                }
            }
        }
        System.out.println("Minimum Spanning Tree: "+finalCost);
        System.out.println(mst);
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 10 }, { 0, 2, 15 }, { 0, 3, 30 }, { 1, 0, 10 }, { 1, 3, 40 }, { 2, 0, 15 },
                { 2, 3, 50 }, { 3, 1, 40 }, { 3, 2, 50 } };
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(arr,  graph);
        primsMST(graph);
    }
}
