package Map;


import java.util.HashMap;
import java.util.Map;

public class Example4 {

    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<Person, Integer>();
        map.put(new Person("홍길동", 18), 101);
        map.put(new Person("임꺽정", 19), 102);

        System.out.println(map.get(new Person("홍길동", 18)));
        System.out.println(map.get(new Person("임꺽정", 19)));
    }
}


