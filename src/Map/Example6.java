package Map;


import java.util.HashMap;
import java.util.Map;

public class Example6 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 101);
        map.put("b", 102);
        map.put("c", 103);

        for (String key : map.keySet())
            System.out.printf("(%s, %d) ", key, map.get(key));
        System.out.println();

        for (Map.Entry<String,Integer> entry : map.entrySet())
            System.out.printf("(%s, %d) ", entry.getKey(), entry.getValue());
        System.out.println();
    }
}


