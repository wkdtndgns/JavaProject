package lecture4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Example7 {

    static void solution(List<Integer> a) {


        int index = 0;
        while (index < a.size()) {
            int value = a.get(index);
            if ((value % 2) == 0 || (value % 3) == 0)
                a.remove(index);
            else
                ++index;
        }


    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 30; ++i)
            a.add(random.nextInt(8) + 1);
        System.out.println(a.toString());
        solution(a);
        System.out.println(a.toString());
    }
}

