package lecture3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exampl1 {

    static List<String> solution(String[] a1, String[] a2, String[] a3) {

    	List<String> list =new ArrayList<String>();
    		
    	for(int i=0; i<a1.length; i++) {
    		for(int j=0; j<a2.length; j++) {
    			if(a1[i]==a2[j])
    				System.out.println(a1[i]);
    		}
    	}
    	return list;


    }

    public static void main(String[] args) {
        String[] a1 = { "A", "B", "D", "F", "G" };
        String[] a2 = { "B", "C", "F", "H", "I" };
        String[] a3 = { "B", "F", "G", "H", "I" };

        System.out.println(solution(a1, a2, a3));
    }
}

