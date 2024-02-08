import java.util.ArrayDeque;

public class Arrdeq {
     public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.offer(20);
        a.offerFirst(10);
        a.offerLast(30);
        a.offer(40);
        a.offer(50);
        System.out.println(a);
        System.out.println(a.peek());
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());
        System.out.println(a.poll());
        System.out.println(a.pollFirst());
        System.out.println(a.pollLast());
     }
    
}
