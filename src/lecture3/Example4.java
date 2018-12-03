package lecture3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

    public static void main(String[] args) {
        String s = "<tr><td>홍길동</td><td>18</td></tr><tr><td>임꺽정</td><td>19</td></tr>" +
                   "<span>false</span><div><span>true</span></div>";

        solution(s);
    }
    
    static void solution(String s) {
    	String regex ="[^<*+^>^</*+^>]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find())
            System.out.println(matcher.group(0));

    	
    }
}

