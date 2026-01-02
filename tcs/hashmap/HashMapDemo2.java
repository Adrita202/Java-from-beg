import java.util.*;
public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(31,"harsh");
        map.put(11,"akshay");
        String s =map.get(69);
        System.out.println(s);

        System.out.println(map.containsKey(11));
        System.out.println(map.containsValue("harsh"));

        // Set<Integer> keys=map.keySet();
        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }
        

    }
}
