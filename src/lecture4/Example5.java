package lecture4;

import java.util.Arrays;

public class Example5 {

    static String[] convertToArray(String s) {
    	String[] arr=s.split("[ 1-9 \\@ \\- \\,.;\t\n]+");
    	
    	
    	return arr;
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

