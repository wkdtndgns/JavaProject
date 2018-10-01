package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays1 {
    
    static Random random = new Random();
    
    static int[] makeIntArray(int count) {
        int[] a = new int[count];
        for (int i = 0; i < count; ++i)
            a[i] = random.nextInt(count);
        return a;
    }
    
    public static boolean isNull(String s) {    		
    	boolean b =true; 
    	if(s!=null)
    		b=false;
    	String s1 =" h";
    	
    	return b;
    }
    
    public static void main(String[] args) {
        int[] a = makeIntArray(20);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
              
        int index = Arrays.binarySearch(a,  10);
        System.out.printf("index of 10: %d\n", index);
        
        int[] b = Arrays.copyOf(a, a.length);
        System.out.printf("Arrays.equals(a, b) : %b\n", Arrays.equals(a, b));
        
        System.out.printf("a.equals(b) : %b\n", a.equals(b));
        System.out.println(a.toString());
    }

}

