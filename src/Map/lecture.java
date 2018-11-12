package Map;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lecture {

	public static void main(String[] args) throws Exception{
		String filePath = "C:\\Users\\wkdtn\\git\\JavaProject\\src\\ex1";
		Scanner scanner = new Scanner(Paths.get(filePath));
		scanner.useDelimiter("[^a-zA-Z]+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		while (scanner.hasNext()) {
			String s = scanner.next();
			for(int i=0; i<s.length();i++) {
				String key = String.valueOf(s.charAt(i));
				if(map.get(key)==null) {
					map.put(key, 1);}
				else {
					int temp = map.get(key);
					map.remove(key);
					map.put(key, temp+1);
				}
			}			
		}
		
		ArrayList<String> al = new ArrayList<String>();
		
		String[] arr = map.toString().replaceAll("[\\{\\}]"," ").split(",");
		
//내림차순 짜는중
		for(int i=0; i<arr.length; i++) {
			al.add(arr[i]);
		}		
		al.sort(new MapComparator());

		
		System.out.println(map.toString());

		System.out.println("내림차순");
		System.out.println(al);
		scanner.close();
	}
}

class MapComparator implements Comparator<String>  {

	@Override
	public int compare(String s1, String s2) {
		String[] arr1=s1.split("=");
		String[] arr2=s2.split("=");
		return Integer.parseInt(arr2[1].trim())-Integer.parseInt(arr1[1].trim());
	}
	
}