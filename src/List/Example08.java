package List;

import java.util.ArrayList;
import java.util.List;

public class Example08 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");

        list.set(1, list.get(0));
        list.set(3, list.get(2));

        for (String s : list)
            System.out.printf("%s ", s);
    }
}

