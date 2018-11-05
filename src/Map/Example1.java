package Map;


import java.util.HashMap;
import java.util.Map;

public class Example1 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 101);
        map.put("b", 102);
        map.put("c", 103);

        System.out.printf("%d %d %d\n", map.get("a"), map.get("b"), map.get("c"));
    }
}


