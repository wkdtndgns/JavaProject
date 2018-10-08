package Arrays;

import java.util.Arrays;
import java.util.List;

public class lecture {

	public static void main(String[] args) {
		Integer[] a = new Integer[] { 10, 3, 5, 2, 8 };
		
		List<Integer> arr = Arrays.asList(a);
		
		Arrays.sort(a);
		
		int index = Arrays.binarySearch(a, 8);
		System.out.println(index);
	
	}
}
