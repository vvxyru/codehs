// Student.java
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor. 
     */
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }
    
    public boolean isHonorsStudent()
    {
        if (gpa >= 3.5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}

// StudentTester.java
public class StudentTester extends ConsoleProgram
{
    public void run()
    {
        Student alan = new Student("Alan", "Turing", 11);
        alan.setGPA(3.5);
        Student ada = new Student("Ada", "Lovelace", 12);
        ada.setGPA(3.8);
        
        System.out.println(alan);
        System.out.println(ada);
    }
}
