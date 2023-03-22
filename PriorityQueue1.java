import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        Queue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(67);
        pq.offer(23);
        pq.offer(68);
        pq.offer(89);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    
}
