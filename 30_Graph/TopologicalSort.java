import java.util.*;

public class TopologicalSort {
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
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
    }
    public static void topologicalSort(ArrayList<Edge>[] graph){
        int v = graph.length;
        Stack<Integer> s = new Stack<Integer>();
        boolean visited[] = new boolean[v];
        for(int i = 0; i < v; i++){
            if(!visited[i]){
                topologicalSortUtil(graph, i, visited, s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }
    private static void topologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> s){
        visited[curr] = true;
        for(Edge edge : graph[curr]){
            int dest = edge.dest;
            if(!visited[dest]){
                topologicalSortUtil(graph, dest, visited, s);
            }
        }
        s.push(curr);
    }
    public static void calIndeg(ArrayList<Edge>[] graph, int[] indeg){
        int v = graph.length;
        for(int i = 0; i < v; i++){
            for(Edge e : graph[i]){
                indeg[e.dest]++;
            }
        }
    }

    // ? Kahn's algorithm O(V+E)
    public static void topSort(ArrayList<Edge>[] graph){
        int v = graph.length;
        int[]  indeg = new int[v];
        //? Find in-degree for each vertex
        calIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < v; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");
            for(Edge e : graph[curr]){
                int dest = e.dest;
                indeg[dest]--;
                if(indeg[dest] == 0){
                    q.add(dest);
                }
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
        System.out.println();
        topologicalSort(graph);
    }
}
