package chapter9_course;


/**
   This program demonstrates the Course class.
*/
public class CourseDemo{
   public static void main(String[] args)
   {
      // Create an Instructor object.
      Instructor myInstructor = new Instructor("Htan", "Khai", "H3234");
      
      // Create a TextBook object.
      TextBook myTextBook = new TextBook("Starting Out with Java",
                       "Gaddis", "Scott/Jones");
                       
      // Create a Course object.
      Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);
      
      // Display the course information.
      System.out.println(myCourse);
   }
}