public class DisJointDS {
    static int n = 7;
    static int[] rank = new int[n];
    static int[] parent = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        parent[x] = find(parent[x]);
        return parent[x];
    }

    public static void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);
        if (xRoot == yRoot) {
            return;
        } else if (rank[xRoot] == rank[yRoot]) {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else {
            parent[yRoot] = xRoot;
        }
    }

    public static void main(String[] args) {
        init();
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(4));
        union(1, 5);
    }
}
