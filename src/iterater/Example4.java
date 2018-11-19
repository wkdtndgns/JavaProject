package iterater;


import java.util.ArrayList;
import java.util.Collection;

public class Example4 {
    
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();

        for (int i = 0; i < 10; ++i)
            c.add(i);
        
        for (int i : c) 
            System.out.print(i + " ");
        
        System.out.println();

        for (int i : c)
            if (i % 2 == 0) c.remove(i);

        for (int i : c) 
            System.out.print(i + " ");        
    }

}

//c 컬렉션 객체에서 짝수인 값들을 제거하는 코드를 위와 같이 구현할 수는 없다.

//컬렉션 객체를 for 문으로 탐색하는 도중에, 그 컬렉션 객체가 수정되는 메소드(add, remove, addAll, clear 등)가 호출되면 에러가 발생한다.

//컬렉션 객체를 탐색하는 도중에, 이터레이터 객체의 remove 메소드를 호출하는 것은 허용된다


