
package studentinfo;


public class Student
{

    //Fields
    private String name;
    private String studentId;
    private double[] exam = new double[3];
    private String major;

    //Set 3 constructors
    /**
     * The default constructor
     */
    public Student()
    {
        name = "no Name";
        studentId = "S000000";
        major = "no Major";
    }

    /**
     * Accepts two strings for the students name and ID
     *
     * @param studentName students name
     * @param studentIdNum students ID
     */
    public Student(String studentName, String studentIdNum)
    {
        name = studentName;
        checkID(studentIdNum);
    }

    /**
     * Accepts three strings for the students name, ID, and major
     *
     * @param studentName students name
     * @param studentIdNum students ID
     * @param studentMajor students major
     */
    public Student(String studentName, String studentIdNum, String studentMajor)
    {
        name = studentName;
        studentId = studentIdNum;
        major = studentMajor;
    }

    //Create four mutators
    /**
     * Is a mutator that sets a students name
     *
     * @param nameGiven Name
     */
    public void setName(String nameGiven)
    {

        name = nameGiven;
    }

    /**
     * Is a mutator that sets a students ID
     *
     * @param studentIdGiven students ID
     */
    public void setStudentId(String studentIdGiven)
    {
        checkID(studentIdGiven);
    }

    /**
     * Is a mutator that sets a students exam grades
     * @param exam1 score 1
     * @param exam2 score 2 
     * @param exam3 score 3
     */
    public void setExam(double exam1, double exam2, double exam3)
    {
        exam[0] = exam1;
        exam[1] = exam2;
        exam[2] = exam3;
    }

    /**
     * Is a mutator that sets a students major
     *
     * @param majorGiven students major
     */
    public void setMajor(String majorGiven)
    {
        major = majorGiven;
    }

    //Create 3 accessors
    /**
     * Is a getter to return the students name
     *
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Is a getter to return the students ID number
     *
     * @return ID number
     */
    public String getStudentId()
    {
        return studentId;
    }

    /**
     * Is a getter to return the students major
     *
     * @return major
     */
    public String getMajor()
    {
        return major;
    }

    /**
     * This method checks to see if the students ID is valid or not without a
     * return statement
     *
     * @param ID Checks to see if the students ID is valid
     */
    private void checkID(String ID)
    {
        //A boolean and for statement testing if the ID is valid
        boolean flag = true;
        for (int i = 1; i < ID.length(); i++)
        {
            char temp = ID.charAt(i);
            if (!Character.isDigit(temp))
            {
                flag = false;
            }
        }
        if (flag && ID.charAt(0) == 'S' && ID.length() == 7)//Makes sure the ID is correct if it is 7 digits long and is printed correctly
        {
            studentId = ID;
        } else
        {
            studentId = "S000000";
        }

    }

    /**
     * Takes the 3 exams and averages them out
     *
     * @return the exam average
     */
    public double examAve()
    {
        double sum = exam[0];
        for (int i = 1; i < exam.length; i++)
        {
            sum += exam[i];
        }
        return sum / exam.length;
    }

    /**
     * This method creates a layout to print the students information
     */
    public void printInfo()
    {
        System.out.println("Student's Information:");   
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student's Major: " + major);
        System.out.println("");
    }

}
