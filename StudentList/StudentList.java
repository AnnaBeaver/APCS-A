import java.util.*;
public class StudentList
{
    //making a student list object
    Student student = new Student();
    //int i = 0;
    Scanner scanner = new Scanner(System.in);
    String keyboard = scanner.nextLine();

    //makes the Array Lists for all the necesarry variables
    static ArrayList <String> FirstName = new ArrayList <String>();
    static ArrayList <String> MiddleName = new ArrayList <String>();
    static ArrayList <String> LastName = new ArrayList <String>();
    static ArrayList <Integer> StudentID = new ArrayList <Integer>();
    static ArrayList <Double> GPA = new ArrayList <Double>();

    public static void addStudent(){
        //prints Adding Student...
        System.out.println("Adding Student...");

        //getting the first name
        System.out.println("What is the student's first name?");
        //takes keyboard input
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine();
        //sets keyboard input to the student's first name
        FirstName.add(input2);
        System.out.println(FirstName);

        //getting the middle name
        System.out.println("What is the student's middle name?");
        System.out.println("space is an acceptable answer.");
        //takes keyboard input
        Scanner scanner3 = new Scanner(System.in);
        String input3 = scanner3.nextLine();
        //sets keyboard input to the student's middle name
        MiddleName.add(input3);
        System.out.println(MiddleName);

        //getting the last name
        System.out.println("What is the student's last name?");
        //takes keyboard input
        Scanner scanner4 = new Scanner(System.in);
        String input4 = scanner4.nextLine();
        //sets keyboard input to the student's last name
        LastName.add(input4);
        System.out.println(LastName);
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
    

    public static void printStudentList(){
        System.out.print(Student.fullName + ", ");
        System.out.print(Student.studentNumber + ", ");
        System.out.println(Student.gpa);
    }

    public static void printStudent(){
        System.out.println(Student.fullName);
        System.out.println(Student.studentNumber);
        System.out.println(Student.gpa);
    }

    public static void search(String name, int num){
        if (name != null){
            name = Student.firstName;
        }
        if (num != -1){
            num = Student.studentNumber;
        }
    }

    public static void clear(){
        System.out.println("Enter the name or ID of the student you would like to clear");
        //get input of the name or student ID of the kid to be deleted
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine();
        System.out.println(scanner2 + "has been cleared.");
    }

    public static void parseUserInput(String fullName){
        fullName.indexOf(" ");
        if(fullName.indexOf(",") != -1){
            Student.lastName = fullName.substring(0,fullName.indexOf(", "));
            Student.firstName = fullName.substring((fullName.indexOf(", ")),(fullName.indexOf(" ")));
        }
        else if((fullName.indexOf( " ") != -1 && (fullName.indexOf(" ") +1) != -1)){
            Student.firstName = fullName.substring(0,fullName.indexOf(" "));
            Student.middleName = fullName.substring((fullName.indexOf(" ")+1),(fullName.indexOf (" ")));
        }
        else{
            Student.firstName = fullName.substring(0, fullName.indexOf(" "));
            Student.lastName = fullName.substring(fullName.indexOf(" ")+1);
        }
    }

    public static void filterSearchStudentList(){

    }

}
