import java.util.Objects;

public class Students implements Comparable<Students>{
   String name ;
   int roll;

   public Students(String name ,int roll )
   {
     this.name=name;
     this.roll=roll;
   }
   @Override
   public String toString()
   {
    return "Student{" + "Name = "+name + '\'' + ", roll no "+ roll +'}';
    }
    @Override
    public boolean equals(Object o)
    {
      if(this == o) return true;
      if (o == null || getClass() != o.getClass() ) return false;
      Students s = (Students) o;
      return roll == s.roll;
    }
    @Override
    public int hashCode()
    {
      return Objects.hash(roll);
    }

    @Override
    public int compareTo(Students that)
    {
      return this.roll-that.roll;
    }
}
