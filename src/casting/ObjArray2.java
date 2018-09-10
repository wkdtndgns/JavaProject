package casting;

import java.util.Date;

import person.*;

public class ObjArray2 {
    
    public static void main(String[] args) {
        Object[] a = new Object[7];
        Person p = new Person("전우치", 24);
        
        a[0] = "hello";
        a[1] = new String("world");
        a[2] = new Date();
        a[3] = new Person("홍길동", 18);
        a[4] = new int[] { 1, 2, 3 };
        a[5] = new String[] { "one", "two", "three" };
        a[6] = new Person[] { new Person("임꺽정",22), p }; 
        
        for (Object o : a) {
            System.out.println(o);
        }
    }

}
