package homeWork;


public class Example04 {

    static String removeO(String s) {
    	String s1 = s.replaceAll("O", "");	
    	s1 = s1.replaceAll("o","");
    	return s1; 
    }

    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world", "yahoo" };
        for (String s : a) {
            String temp = removeO(s);
            System.out.println(temp);
        }
    }
}
