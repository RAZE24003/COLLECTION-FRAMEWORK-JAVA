import java.util.HashSet;
import java.util.Set;

public class Settry {
    public static void main(String[] args) {
        Set <Students> s = new HashSet<>();
        s.add(new Students("Soumadeep", 9));
        s.add(new Students("Souma", 3));
        s.add(new Students("deep", 21));
        s.add(new Students("S", 9));
        System.out.println(s);
    }
    
}
