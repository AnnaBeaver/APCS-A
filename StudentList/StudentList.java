import java.util.*;
public class StudentList
{
    public static Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    ArrayList <String> Student_List = new ArrayList <String>();
    public static void addStudent(String input){
        StudentList s1 = new StudentList();
        System.out.println("Enter Student Name");
        StudentList.parseUserInput(scanner.nextLine(),Student_List.add);
    }

    public static void deleteStudentFromList(){
        
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
        if(input.equals( "y")){
            System.out.println("the list has been cleared");
        }
        else{
            //return to menu
        }
    }

    public static void printStudentList(){
        System.out.println(Student.fullName);

    }

    public static void printStudent(){
        System.out.println(Student.fullName);
        System.out.println(Student.stuNumber);
        System.out.println(Student.gpa);
    }

    public static void search(String name, String num){
        if (name != null){
            name = Student.firstName;
        }
        if (num != null){

        }
    }

    public static void clear(){

    }

    public static void addStudentToList(){

    }

    public static void parseUserInput(String fullName, Student student){
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
}
