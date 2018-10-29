package homeWork.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam15 {

    static void sort(int[] a) {
    	Arrays.sort(a);
    }

    static int[] insert(int[] a, int value) {
    	int index= Arrays.binarySearch(a, value);
   
    	if(index<0) {
    		int[] temp = new int[a.length+1];
    		int indexAbs =Math.abs(index);
    		
    		for(int i=0; i<indexAbs -1;i++)
    			temp[i]=a[i];
    		
    		temp[indexAbs-1]=value;
    		
    		for(int i=indexAbs-1; i<a.length;i++)
    				temp[i+1]=a[i];
    		
    		return temp;
    	}
    	
    	return a;
    }

    public static void main(String[] args) {
        int[] a = { 3, 8, 1, 2, 4, 5, 7 };

        sort(a);
        System.out.println(Arrays.toString(a));

        a = insert(a, 2);
        a = insert(a, 6);
        System.out.println(Arrays.toString(a));
    }
}

