package lecture2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {

    static int solution(List<Integer> list) {
        // list 목록에서 가장 여러 번 등장하는 정수 값을 리턴하라
        Map<Integer, Integer> map = new HashMap<>();
        int maxValue = 0, maxCount = 0;
        for (int value : list) {
            Integer count = map.get(value);
            map.put(value, count == null ? 1 : count + 1);
            if (map.get(value) > maxCount) {
                maxCount = map.get(value);
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        List<Integer> a =
                Arrays.asList(new Integer[] {1, 7, 1, 8, 5, 2, 2, 3, 5, 3, 1, 3, 7});
        System.out.println(a.toString());
        int maxValue = solution(a);
        System.out.println(maxValue);
    }
}
