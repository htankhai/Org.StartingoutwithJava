package chapter11_CS;
/**
   This program demonstrates the CompSciStudent class.
*/
public class CompSciStudentDemo{
   public static void main(String[] args)
   {
      // Create a CompSciStudent object.
      CompSciStudent csStudent = new CompSciStudent("Htan Khai",
                                "167W98337", 2004);

      // Store values for math, CS, and gen ed hours already taken
      csStudent.setMathHours(18);
      csStudent.setCsHours(30);
      csStudent.setGenEdHours(55);

      // Display the student's data.
      System.out.println(csStudent);

      // Display the number of remaining hours.
      System.out.println("Hours remaining: " +
                   csStudent.getRemainingHours());       
   }
}