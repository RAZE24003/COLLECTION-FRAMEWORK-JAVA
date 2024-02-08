import java.util.LinkedHashSet;
public class Lhashset {
public static void main(String[] args) {
        LinkedHashSet <Integer> h = new LinkedHashSet<>();
        // here order is maintained
        // like queue
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(15);
        h.add(22);
        h.add(44);
        System.out.println(h);
        h.remove(10);
        System.out.println(h);
        System.out.println(h.contains(22));
        System.out.println(h.isEmpty());
        System.out.println(h.size());
    }
    
}