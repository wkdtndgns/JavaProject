package regular;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lecture02 {
    
    static String readTextFile(String path) throws IOException {
        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), "EUC-KR"))) {
            StringBuilder builder = new StringBuilder();
            String s = reader.readLine();

            while (s != null) {
                builder.append(s);
                builder.append("\n");
                s = reader.readLine();
            }
            return builder.toString();
        }        
    }
    
    public static void main(String[] args) throws IOException {        
        String path = "c:/홈페이지_게시판.html";
        String s = readTextFile(path);
        
        String regex = "<a href='boardread.aspx\\?idx=([0-9]+)[^>]+>([^<]+)</a>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find())
                System.out.printf("%s %s\n", matcher.group(1), matcher.group(2));

    }

}

