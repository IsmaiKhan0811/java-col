
import java.util.PriorityQueue;

public class PQ { // Priority quesue
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(); // Hetrogenous data not allowed
        pq.add(25);
        pq.add(23);
        pq.add(98);
        pq.add(89);
        pq.add(66);
        pq.add(56);
        pq.add(45);
        System.out.println(pq);
        pq.add(25); // Duplicate allow
        System.out.println(pq);

        
    }}
    

