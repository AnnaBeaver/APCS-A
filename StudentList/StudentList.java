import java.util.*;
public class StudentList
{
    Scanner scanner = new Scanner(System.in);
    String keyboard = scanner.nextLine();
    
    //makes the Array Lists for all the necesarry variables
    static ArrayList <String> FirstName = new ArrayList <String>();
    static ArrayList <String> MiddleName = new ArrayList <String>();
    static ArrayList <String> LastName = new ArrayList <String>();
    static ArrayList <Integer> StudentID = new ArrayList <Integer>();
    static ArrayList <Double> GPA = new ArrayList <Double>();
    
    ArrayList Students = new ArrayList();

    public static void addStudent(){
        Student student = new Student();
        //prints Adding Student...
        System.out.println("Adding Student...");
        
        Student.FullName();
    }

    public static void deleteStudentFromList(){
        System.out.println("Please enter name or Student ID of the student you would like to delete");
        
        //get input of the name or student ID of the kid to be deleted
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine();
        
        //print "Student [name] has been deleted"
        System.out.println("Student " + scanner2 + " has been deleted.");
    }

    public static void editStudentList(){
        System.out.println("What would you like to edit?");
        System.out.println("1.) Name");
        System.out.println("2.) Student ID");
        System.out.println("3.) GPA");
        
        //get input from keyboard of what number is entered
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine();
        
        if (input2.equals("1")){
            System.out.println("Please enter student name");
            
        }
        if (input2.equals("2")){
            System.out.println("Please enter student ID");
            
        }
        if (input2.equals("2")){
            System.out.println("Please enter student GPA");
            
        }
    }

    public static void clearList(String input){
        System.out.println("Are you sure you want to clear the list?");
        System.out.println("This action cannot be undone");
        System.out.println ("Please enter y for yes, or n for no");
        //get input of the keyboard for if to delete the list or not
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine();
        if(input.equals( "y")){
            System.out.println("the list has been cleared");
        }
            //return to menu
        }

    public static void filterSearchStudentList(){

    }

    public static void printStudentList(){
        
    }
}
