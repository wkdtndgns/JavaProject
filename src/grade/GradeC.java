package grade;

public class GradeC {
	
	public static final GradeC Ap = new GradeC(4.5);
	public static final GradeC A = new GradeC(4.0);
	public static final GradeC Bp = new GradeC(3.5);
	public static final GradeC B = new GradeC(3.0);
	public static final GradeC Cp = new GradeC(2.5);
	public static final GradeC C = new GradeC(2.0);
	
	

	private double value;
    
    GradeC(double value) {
    	this.value = value;  	
    }
    
    public double getValue() {
        return this.value;
    }
}
