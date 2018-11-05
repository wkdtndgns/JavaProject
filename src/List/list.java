package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class list {
	   static void addRandomValue(Collection<Integer> al, int count) {
	        Random random = new Random();
	        for (int i = 0; i < count; ++i)
	            al.add(random.nextInt(20));
	    }

		public static void main(String[] args) {
			Collection<Integer> al = new ArrayList<Integer>();
			addRandomValue(al, 200); 
			System.out.println(al);
				
		}
}
