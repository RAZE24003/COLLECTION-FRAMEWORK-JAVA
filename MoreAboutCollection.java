import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MoreAboutCollection {
    public static void main(String[] args) {
    ArrayList<Integer> s=new ArrayList<>();
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(22);
    s.add(5);
    s.add(9);
    s.add(0);
    System.out.println("Min : "+ Collections.min(s));
    System.out.println("Max : "+Collections.max(s));
    System.out.println(Collections.frequency(s, 9));
    Collections.sort(s);
    System.out.println(s);
    Collections.sort(s, Comparator.reverseOrder());
    System.out.println(s);


    List <Students> si = new ArrayList<>();
        si.add(new Students("Soumadeep", 9));
        si.add(new Students("Souma", 3));
        si.add(new Students("deep", 21));
        si.add(new Students("S", 9));
    Students s1= new Students("aa", 01);
    Students s2= new Students("ab", 02);
    System.out.println(s1.compareTo(s2));
    Collections.sort(si);
    System.out.println(si);
    Collections.sort(si, new Comparator<Students>() {
    
        @Override
        public int compare(Students o1, Students o2)
        {
        return o1.name.compareTo(o2.name);
        }
    });
    System.out.println(si);
}
}
