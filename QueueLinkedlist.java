import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedlist {
    public static void main(String[] args) {
        Queue<Integer> a= new LinkedList<>();

        a.offer(12);
        a.offer(24);
        a.offer(36);
        System.out.println(a);
        System.out.println(a.poll());
        System.out.println(a);
        System.out.println(a.peek());
        
    }
}
