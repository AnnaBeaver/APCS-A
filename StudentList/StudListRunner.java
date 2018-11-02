import java.util.*;
public class StudListRunner
{
    //making a student list object
    Student student = new Student();
    //int i = 0;
    Scanner scanner = new Scanner(System.in);
    String keyboard = scanner.nextLine();
    
    public static void setMenu(){
        //selection is the variable that holds what number the person wants
        String selection = "0";
        while (!selection.equals("7")){
            //Menu
            System.out.println(" ");
            System.out.println("1.) add Student to List");
            System.out.println("2.) Delete Student from List");
            System.out.println("3.) Edit Student List");
            System.out.println("4.) Clear List");
            System.out.println("5.) Print List");
            System.out.println("6.) Print Student Profile");
            System.out.println("7.) Quit Menu");
            System.out.print("Please type one of the numbers ");

            //Takes data from the keyboard and sets it equal to string scanner
            //this scanner is for the variable selection, and should hold a number between 1 and 7
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            selection = input;

            //checks for each of the appropriate values, otherwise returns an error
            if (selection.equals("1")){
                StudentList.addStudent();
            }

            else if(selection.equals("2")){
                StudentList.deleteStudentFromList();
            }
            else if (selection.equals("3")){
                StudentList.editStudentList();
            }
            else if (selection.equals("4")){ 
                StudentList.clearList(input);
            }
            else if (selection.equals("5")){
                StudentList.printStudentList();
            }
            else if (selection.equals("6")){
                StudentList.printStudent();
            }
            else if (selection.equals("7")){
                //Exit
            }

            else{
                System.out.println("Not a valid input. Please try again");
            }
            System.out.println("Done");
        }
    }
}

