package Map;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lecture {

	public static void main(String[] args) throws Exception{
		String filePath = "C:\\Users\\wkdtn\\git\\JavaProject\\src\\ex1";
		Scanner scanner = new Scanner(Paths.get(filePath));
		scanner.useDelimiter("[^a-zA-Z]+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		while (scanner.hasNext("[a-zA-Z]+")) {
			String s = scanner.next();
			for(int i=0; i<s.length();i++) {
				String key = String.valueOf(s.charAt(i));
				if(map.get(key)==null) {
					map.put(key, 0);}
				else {
					int temp = map.get(key);
					map.remove(key);
					map.put(key, temp+1);
				}
			}			
		}
		
		System.out.println();
		scanner.close();
	}
}
