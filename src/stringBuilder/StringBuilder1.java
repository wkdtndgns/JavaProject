package stringBuilder;


public class StringBuilder1 {
    
    public static void main(String[] args) {
        String[] list = new String[] { "one", "two", "three", "four", "five", "six", "seven" };
        
        String temp = "";
        for (String s : list) { 
            if (temp.length() > 0) temp = temp + ", ";
            //string 객체가 새로만들어짐 
            /* 
             	컴파일러 최적화 compiler optimiztion 
             	
             */
            temp = temp + "\"" + s + "\""; 
        }
        System.out.println(temp);
        
        StringBuilder builder = new StringBuilder();
        for (String s : list) {
            if (builder.length() > 0) builder.append(", ");
            builder.append('"');
            builder.append(s);
            builder.append('"');
        }
        System.out.println(builder.toString());
    }

}

