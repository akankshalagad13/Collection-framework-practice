import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(21);
        queue.offer(56);
        queue.offer(87);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove(4));

    }
    
}
