// package hashmap;
import java.util.*;
public class DemoMap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Kunal",89);
        map.put("karan",99);
        map.put("rahul",94);
        System.out.println(map.get("karan"));
        System.out.println(map.getOrDefault("rohan", 70));

        System.out.println(map.containsKey("rahul"));
        System.out.println(map);

        HashSet<Integer> set=new HashSet<>();
        set.add(56);
        set.add(65);
        set.add(15);
        set.add(15);
        set.add(20);
        System.out.println(set);

        //Map is an obj that maps keys to values,It cannot contain duplicate keys, and each key can map to at most one value. 
        //map is interface
        //hashmap is a implementation class of map
        // IT DOES NOT EXTEND COLLECTION

       // unordered
        // allows null keys and values
        // not synchronized: not thread safe  
        // offers constant time performance O(1) for basic op like get put 

    }
    
}
