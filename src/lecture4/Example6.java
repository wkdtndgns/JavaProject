package lecture4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Example6 {

    static void solution(int[] a) {
    	for(int i=0; i<a.length; i++) {
    		
    		if(a[i]%2==0) {
    			a[i]=-1;	
    		
    		}
    		else if(a[i]%3==0) {
    			a[i]=-1;	
    		}
    		else {
    			int j =i;
    			if(j!=0) {
	    			while(a[j]!=-1) {
	    				j--;
	    			}
	    			
	    			int temp= a[i];
	    			a[i]=-1;
	    			a[j]=temp;
    			}
    		}
    	}
    
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[30];
        for (int i = 0; i < 30; ++i)
            a[i] = random.nextInt(8) + 1;
        System.out.println(Arrays.toString(a));
        solution(a);
        System.out.println(Arrays.toString(a));
    }
}


