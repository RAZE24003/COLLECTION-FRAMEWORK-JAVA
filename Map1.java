import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        // sorted like hash code
        Map<String,Integer> si =new HashMap<>();
        si.put("One", 1);
        si.put("Two", 2);
        si.put("Three", 3);
        si.put("Four", 4);
        si.put("Five", 5);
        // if we again declare same key with another value then the previous key will be overwritten
        // si.put("Two", 22);


        // by this checking it will not be overwritten
        // if(!si.containsKey("Two"))
        // {
        //     si.put("two",  22);
        // }



            // iit will work same as if condition
            si.putIfAbsent("Two", 23);

            // iteration........
            for(Map.Entry<String,Integer> e: si.entrySet())
            {
                System.out.println(e);
                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }

            for(String key : si.keySet())
            {
                System.out.println(key);
            }

             for(Integer val : si.values())
            {
                System.out.println(val);
            }
            System.out.println(si.containsKey("One"));
            System.out.println(si.containsValue(2));
            System.out.println(si.isEmpty());
            si.clear();

        System.out.println(si);
         System.out.println(si.isEmpty());
    }
    
}
