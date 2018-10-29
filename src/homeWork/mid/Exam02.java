package homeWork.mid;

import java.util.Arrays;

public class Exam02 {

    static String toString(Person[] a) {
    	String[] result=new String[a.length];
    	
    	for(int i =0; i<result.length; i++)
    		result[i]=a[i].toString();
    	
    	return Arrays.toString(result);
    }

    public static void main(String[] args) {
        Person[] a = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 21) };

        System.out.println(toString(a));
    }
}
