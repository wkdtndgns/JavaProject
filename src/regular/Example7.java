package regular;

import java.util.Arrays;

public class Example7 {
    
    public static void main(String[] args) {
        String s = "one two, three,\t four; \t\nfive..,six";        
        String[] a = s.split("[ ,.;\t\n]+");
        System.out.println(Arrays.toString(a));
    }

}
