import java.util.HashSet;

public class Hashhhhset {
    public static void main(String[] args) {
        HashSet <Integer> h = new HashSet<>();
        // here order is by hash map internally
        // doesn't maintain order
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(10);
        System.out.println(h);
        h.remove(10);
        System.out.println(h);
        System.out.println(h.contains(22));
        System.out.println(h.isEmpty());
        System.out.println(h.size());
    }
    
}
