package homeWork.mid;

public class Exam10 {

    static int sum(int[][] a) {
    	int result=0;
    	
    	for(int i=0; i<a.length; i++) {
    		for(int j=0; j<a[i].length;j++)
    			result+=a[i][j];
    	}
    		
    	return result;
    }

    public static void main(String[] args) {
        int[][] a = new int[][] {
            { 1, 2 },
            { 3, 4, 5 },
            { 6, 7, 8, 9 }
        };
        System.out.println(sum(a));
    }
}
