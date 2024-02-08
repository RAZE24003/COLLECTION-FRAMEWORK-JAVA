import java.util.ArrayList;

import java.util.Iterator;

public class Arraylist1 {
public static void main(String[] args) {
    int i;
    ArrayList<String> student = new ArrayList<>();
    student.add("Ram");
    System.out.println(student);
    student.add("sam");
    System.out.println(student);
    student.add("sam1");
    student.add("sam2");
    student.add("sam3");
    student.add(1, "hehe");
    System.out.println(student);
    ArrayList<String> s=new ArrayList<>();
    s.add("1");
    s.add("2");
    s.add("3");
    student.addAll(s);
    System.out.println(student);
    System.out.println(student.get(2));
    System.out.println(student.remove(2));
    student.remove(String.valueOf("sam1"));
    System.out.println(student);
    student.set(3, "100");
    System.out.println(student);
    System.out.println(student.contains("100"));

    for (i = 0; i < student.size(); i++) {
        System.out.println("The element "+i+" is : "+student.get(i));
    }

    for (String string : student) {
         System.out.println("The elements are : "+string);
    }
    Iterator<String> it = student.iterator();

    while (it.hasNext()) {
            System.out.println(it.next());
        
    }
    
    student.clear();
    System.out.println(student);
}
    
}