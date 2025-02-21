import java.util.*;
public class MyPriorityQueue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student other) {
            return this.rank - other.rank;
        }
    }
    public static void main(String[] args) {
        // Simple implementation of Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(3);
        pq.add(4);
        System.out.println("Priority Queue: " + pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();            
        }

        // Priority Queue with custom objects
        PriorityQueue<Student> pq2 = new PriorityQueue<Student>();
        pq2.add(new Student("Alice", 5));
        pq2.add(new Student("Bob", 3));
        pq2.add(new Student("Charlie", 4));
        while (!pq2.isEmpty()) {
            System.out.println(pq2.peek().name+" -> "+pq2.peek().rank);
            pq2.remove();            
        }

    }
}