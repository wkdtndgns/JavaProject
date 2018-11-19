package regular;


public class Example4 {
    
    public static void main(String[] args) {
        String[] a = new String[] { 
                "http://localhost:8080/test/list.jsp?pg=3&sz=15",
                "http://localhost:8080/test/list.jsp?pg=9&sz=10",
                "http://localhost:8080/test/list.jsp?pg=25&sz=20"
        };
        String regex = "(\\?|&)[a-z]+=[0-9]+";
        String regex1 = "\\?.+";
        
        for (String s : a) {
            String temp = s.replaceAll(regex1, "");
            System.out.printf("%s => %s\n", s, temp);
        }
    }

}
