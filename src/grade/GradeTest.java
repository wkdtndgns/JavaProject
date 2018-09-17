package grade;

public class GradeTest {
    
    public static void main(String[] args) {
        
        Grade[] myGrades = { Grade.Ap, Grade.A, Grade.Bp, Grade.B, Grade.A };
        
        double sum = 0;
        for (Grade grade : myGrades)
            sum += grade.getValue();
        System.out.printf("sum=%.2f  average=%.2f\n", sum, sum / myGrades.length);
        
      GradeC[] arrGc = { GradeC.Ap, GradeC.A, GradeC.Bp, GradeC.B, GradeC.Ap};
      
      sum = 0;
      for (GradeC grade : arrGc)
          sum += grade.getValue();
      System.out.printf("sum=%.2f  average=%.2f\n", sum, sum / arrGc.length);
      
    
    }

}

