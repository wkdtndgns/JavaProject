package List.inter;

import java.util.LinkedList;

public class lecture {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		for(int i =0; i<100; i++) 
			li.add(i);
		

		for(int i=0; i<li.size(); i++) {
			if(li.get(i)%2==1)
				li.remove(i);
		}
		System.out.println(li);
	}
	
}
