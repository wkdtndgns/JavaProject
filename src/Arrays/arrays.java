package Arrays;

import java.util.Arrays;
import java.util.Comparator;



public class arrays {
	public static void main(String[] args) {
        Integer[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };

        
        Arrays.sort(a, new IntComparator());
        System.out.println(Arrays.toString(a));
    }
	

}

class IntComparator implements Comparator<Integer> {


	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2) 
			return -1;
		else if(o1==o2)
			return 0;
		else 
			return 1;
	}
	
	
}

