public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    // Add GPA instance variable here
    private double studentGpa;
    
    public Student(String fName, String lName, int grade, double gpa)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        studentGpa = gpa;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel + " and has GPA: " + studentGpa;
    }
}
