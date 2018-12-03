package lecture2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

    static String[] convertToArray(String s) {
        // 문자열 s에서 단어를 추출하여 단어 목록 배열을 리턴하라.
        // 단어는 알파벳들로만 구성되어야 한다.
        // 리턴되는 배열의 단어는 전부 소문자로 변환되어야 한다.
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find())
            list.add(matcher.group(0).toLowerCase());
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] a = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
                       "1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };
        for (String s : a) {
            String[] t = convertToArray(s);
            System.out.println(Arrays.toString(t));
        }
    }
}
