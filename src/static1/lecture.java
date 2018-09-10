package static1;

import java.util.HashMap;

public class lecture {

	static Object[] arr;
	static HashMap<Integer, Integer> IntegerMap = new HashMap<Integer, Integer>();
	static HashMap<Integer, Integer> StringMap = new HashMap<Integer, Integer>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addData(5);
		
		System.out.println(findIndex(1));
		System.out.println(findIndex("1"));
	}
	
	static void addData(int count) {
		
		arr = new Object[count*2];
		int arr_count=0;
		
		for(int i=0; i<count; i++) {
			arr[arr_count] =new Integer(i);
			IntegerMap.put(i,arr_count);
			arr_count++;
			arr[arr_count] =String.valueOf(i);
			StringMap.put(i, arr_count);
			arr_count++;
			
		}
	}

	static int findIndex(int value) {
		return IntegerMap.get(value);
	}
	
	static int findIndex(String value) {
		return StringMap.get(Integer.valueOf(value));
	}
}
