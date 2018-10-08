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
        
       final StringBuilder builder = new StringBuilder();	// 객체는 바꿀 수 있음 객체 내부가 read only 이려면 애초에 
       // immutable 클래스로 구현해야함  final은 변수를 read only 하게 만드는 거임 
       
        for (String s : list) {
            if (builder.length() > 0) builder.append(", ");
            builder.append('"');
            builder.append(s);
            builder.append('"');
        }
        System.out.println(builder.toString());
    }

}

