import java.util.*;
public class Student
{
    
    ArrayList <Student> StudentInfo = new ArrayList<Student> (); 
    
    Scanner scanner = new Scanner(System.in);
    String keyboard = scanner.nextLine();
        static String firstName;
        static String middleName;
        static String lastName;
        static String fullName;
        static int studentNumber;
        static double gpa;
    //Constructor
    public Student(){
        /*String firstName;
        String middleName;
        String lastName;
        String fullName;
        */
    }
    //Setters
    //firstName, middleName, lastName, fullName, studentNumber, gpa
    public static void FullName(){
        //getting the first name
        System.out.println("What is the student's first name?");
        Student.setFirstName();
        
        //getting the middle name
        System.out.println("What is the student's middle name?");
        System.out.println("space is an acceptable answer.");
        Student.setMiddleName();

        //getting the last name
        System.out.println("What is the student's last name?");
        Student.setLastName();
        /*
        Student.setFullName (StudentInfo.firstName, StudentInfo.middleName, StudentInfo.lastName);
        System.out.println(StudentInfo.fullName);
        */
    }
    public static void setFirstName(){
        //takes keyboard input
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine();
        //sets keyboard input to the student's first name
        Student.firstName = input2;
        System.out.println(StudentList.firstName);
    }
    public static void setMiddleName(){
        //takes keyboard input
        Scanner scanner3 = new Scanner(System.in);
        Student.middleName = scanner3.nextLine();
        System.out.println(StudentList.middleName);
    }
    public static void setLastName(){
        //takes keyboard input
        Scanner scanner4 = new Scanner(System.in);
        String input4 = scanner4.nextLine();
        //sets keyboard input to the student's last name
        
        lastName = input4;
        System.out.println(lastName);
    }
    public static void setFullName(String firstName, String middleName, String LastName){
        fullName = firstName + middleName + lastName;
    }
    public static void setStuNumber(int s){
        studentNumber = s;
    }
    public static void setgpa(double s){
        gpa = s;
    }
    //Getters
    public static String getFirstName(){
        return firstName;
    }
    public static String getMiddleName(){
        return middleName;
    }
    public static String getLastName(){
        return lastName;
    }
    public static int getStuNumber(){
        return studentNumber;
    }
    public static double getgpa(){
        return gpa;
    }
}
