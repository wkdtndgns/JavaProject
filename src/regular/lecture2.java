package regular;

public class lecture2 {
	public static void main(String[] args) {
		  String[] a = new String[] { "<Script>","</Script>"};
	        String regex = "0(10|[1-9]{2})-[0-9]{4}-[0-9]{4}";

	        for (String s : a) {
	            if (s.matches(regex))
	                System.out.printf("\"%s\" matches \"%s\"\n", s, regex);
	            else
	                System.out.printf("\"%s\" doesn't match \"%s\"\n", s, regex);
	        }
	}
}
