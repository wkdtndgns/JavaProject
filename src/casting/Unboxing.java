package casting;


public class Unboxing {
    
    public static void main(String[] args) {
        
        int i = 3;
        Integer obj1 = i;
        int j = obj1;
        
        double d = 3.14;
        Double obj2 = d;
        double f = d;
        
        System.out.printf("%d %d %d\n", i, obj1, j);
        System.out.printf("%f %f %f\n", d, obj2, f);       
    }

}

