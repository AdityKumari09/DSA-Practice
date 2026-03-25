import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal", 77);
        map.put("Civo", 89);
        map.put("Rahul", 90);

        System.out.println(map.get("Kunal"));
        System.out.println(map.getOrDefault("Rahul", 76));
        System.out.println(map.getOrDefault("Charlie", 86));

        System.out.println(map.containsKey("Civo"));
        
        System.out.println(map.isEmpty());

        System.out.println(map);

        HashSet<Integer> set = new HashSet<>();

        set.add(56);
        set.add(44);
        set.add(56);
        set.add(89);
        set.add(64);
        set.add(05);

        System.out.println(set);
    }    
}
