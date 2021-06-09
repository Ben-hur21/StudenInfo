 /** 
*  Project :  Project Classes and Objects
*  File    :  StudentDemo
*  Name    :  Ben Hur
*  Date    :  May 4, 2021  (May 9, 2021)
*
*  Description : (Narrative description, not code)
*
*    1) The purpose of this code is to get the students info but also checks for a students valid ID and exam average. 
*    2) The data structure that is used a primitive data structure since we use for and while
*    3) We create the constructors, mutators, accessors, and methods so that once we create in the class we can call them back to our main to print the information.
* We create the three methods to check if the students ID is valid and a exam average method to find the average of the students three exams and finally 
* a method to have a layout to print the information.
*    4) We use three methods to check if the students ID is valid and to get the exam average and to have a format to print the information. 
*  Changes :  <Description|date of modifications>
*/
package studentinfo;


public class StudentDemo
{

    public static void main(String[] args)
    {

        // Declare and instantiate a student
        Student student1 = new Student();
        Student student2 = new Student("John Smith", "S0012T6");
        Student student3 = new Student("Ann Miller", "S001236", "Computer");

        //Print student1 information using printInfo
        student1.setName("Alex Anderson");
        student1.setStudentId("S123456");
        student1.setMajor("Biology");
        student1.printInfo();

        //Print student2 information using a constructor and printInfo 
        student2.setMajor("Math");
        student2.printInfo();

        //Print student3 information including there exam average
        student3.setExam(12, 17, 20);
        System.out.println("Student's Infomation: ");
        System.out.println("Name: " + student3.getName());
        System.out.println("Student ID: " + student3.getStudentId());
        System.out.println("Major: " + student3.getMajor());
        System.out.printf("Exam Average: %.2f", student3.examAve());
        

    }

}
