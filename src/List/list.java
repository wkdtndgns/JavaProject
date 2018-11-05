package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class list {
	static List<Integer> al = new ArrayList<Integer>();
	   
	static void addRandomValue(Collection<Integer> al, int count) {
	        Random random = new Random();
	        for (int i = 0; i < count; ++i)
	            al.add(random.nextInt(20));
	    }

		public static void main(String[] args) {
			addRandomValue(al, 200); 
			System.out.println(al);
			Bubble();
			System.out.println(al);
		}
		
		static void Bubble() {
			for(int i=al.size()-1; i>=1; --i) {
				for(int j=0; j<i; ++j) {
					if(al.get(j)>al.get(j+1))
						swap(j,j+1);
				}
			}
		}		
		static void swap( int i, int j) {
			int temp =al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
		}
}
