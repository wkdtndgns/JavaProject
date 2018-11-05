package Map;

import java.util.HashMap;
import java.util.Map;

public class Example5 {

    public static void main(String[] args) {
        Map<Person2, Integer> map = new HashMap<Person2, Integer>();
        map.put(new Person2("홍길동", 18), 101);
        map.put(new Person2("임꺽정", 19), 102);

        System.out.println(map.get(new Person2("홍길동", 18)));
        System.out.println(map.get(new Person2("임꺽정", 19)));
    }
}


