package lecture3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {

    static List<String> solution(String[] a1, String[] a2, String[] a3) {
    	ArrayList<String> list1 = new ArrayList<String>();
    	ArrayList<String> list2 = new ArrayList<String>();
    	ArrayList<String> list3 = new ArrayList<String>();
    	
    	
    	for(String s :a1)
    		list1.add(s);
    	for(String s :a2)
    		list2.add(s);
    	for(String s :a3)
    		list3.add(s);
    	
    	list1.retainAll(list2);
    	list1.retainAll(list3);
    	return list1;
    }

    public static void main(String[] args) {
        String[] a1 = { "A", "B", "D", "F", "G" };
        String[] a2 = { "B", "C", "F", "H", "I" };
        String[] a3 = { "B", "F", "G", "H", "I" };

        System.out.println(solution(a1, a2, a3));
    }
}

