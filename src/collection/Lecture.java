package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;

public class Lecture {
	
	
    static void printCollection(String s, Collection<String> c) {
        String[] a = c.toArray(new String[0]);
        Arrays.sort(a);
        System.out.printf("%s: %s\n", s, Arrays.toString(a));
    }
    
    
	public static void main(String[] args) {
		
		  Collection<String> c1 = new Stack<String>();
	      Collection<String> c2 = new LinkedList<String>();
	      Collection<String> c3 = new ArrayList<String>();

	        for (int i = 0; i < 20; i += 2) {
	            String s = String.format("%02d", i);
	            c1.add(s);
	        }
	        printCollection("c1 (2의 배수)", c1);
	        
	        for (int i = 0; i < 20; i += 3) {
	            String s = String.format("%02d", i);
	            c2.add(s);
	        }
	        printCollection("c2 (3의 배수)", c2);
	        
	        c3=containSet(c1, c2);
	        
	        printCollection("c1, c2 교집합", c3); 
	        
	        
	        c3.clear();
	        c3=minusSet(c1,c2);
	        printCollection("c1, c2 차집합", c3);
	        c3.clear();
	        c3=minusSet(c2,c1); 
	        printCollection("c2, c1 차집합", c3);
	        c3.clear();
	        c3=sumSet(c1,c2);
	        printCollection("c1, c2 합집합", c3);
	        
	}
	
	static Collection<String> containSet(Collection<String> c1 , Collection<String> c2) {
		Collection<String> c3 =new ArrayList<String>();
		for(String s : c1) {
			if(c2.contains(s))
        	c3.add(s);
		}		
		return c3;
	}
	
	static Collection<String> minusSet(Collection<String> c1 , Collection<String> c2) {
		Collection<String> c3 =new ArrayList<String>();
		for(String s : c1) {
			if(c2.contains(s)==false)
        	c3.add(s);
		}		
		return c3;
	}
	
	static Collection<String> sumSet(Collection<String> c1 , Collection<String> c2) {
		Collection<String> c3 =new ArrayList<String>();
		for(String s : c1)   
			c3.add(s);
		
		for(String s : c2) {
			if(c3.contains(s)==false)
				c3.add(s);
		}
		
		return c3;
	}
	
	
}
