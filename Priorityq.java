import java.util.Comparator;
import java.util.PriorityQueue;

public class Priorityq {
    public static void main(String[] args) {
        // this will work as a min heap
        PriorityQueue<Integer> q = new PriorityQueue<>();
        // here priority is highest for smallest element
        q.offer(16);
        q.offer(14);
        q.offer(17);
        System.out.println(q);
        // if we remove any item it will remove the smallest element
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());


        // this will work like max heap
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Comparator.reverseOrder());
        //  here the priority is highest for maximum value  
        q1.offer(206);
        q1.offer(104);
        q1.offer(97);
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
    }
}
