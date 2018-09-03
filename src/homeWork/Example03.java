package homeWork;

public class Example03 {

    static String getFileName1(String path) {
    	int start = path.lastIndexOf("/");
    	
    	String s = path.substring(start+1, path.length());
    	return s; 
    }

    static String getFileName2(String path) {
    		String[] s= path.split("/");
    				
    		return s[s.length-1]; 
    }

    public static void main(String[] args) {
        String[] a = { "c:/data/student/lecture.docx",
                       "c:/www/mainpage.html",
                       "c:/program files/java/javac.exe" };
        for (String s : a) {
            String fileName1 = getFileName1(s);
            String fileName2 = getFileName2(s);
            System.out.printf("%s, %s\n", fileName1, fileName2);
        }

    }

}
