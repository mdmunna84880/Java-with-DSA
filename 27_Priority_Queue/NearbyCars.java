import java.util.*;
public class NearbyCars {
    static class Points implements Comparable<Points> {
        int x, y;
        int disSq;
        int idx;
        Points(int x, int y, int disSq, int idx){
            this.x = x;
            this.y = y;
            this.disSq = disSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Points o) {
            return this.disSq - o.disSq;
        }
    }
    public static void main(String[] args) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int n = pts.length;
        int k = 2;
        PriorityQueue<Points> q = new PriorityQueue<Points>();
        
        for (int i = 0; i < n; i++) {
            int disSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            q.add(new Points(pts[i][0], pts[i][1], disSq, i));
        }
        
        for(int i = 0; i < k; i++) {
            System.out.println("C"+q.peek().idx);
            q.remove();
        }
    }
}
