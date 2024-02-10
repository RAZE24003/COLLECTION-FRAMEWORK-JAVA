import java.util.TreeSet;

public class Treeeeeset {
    public static void main(String[] args) {
        TreeSet <Integer> h = new TreeSet<>();
        // here order is maintained
        // it sort the data if we need to print sorted data we can use it 
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
