import java.util.*;
public class StudListRunner
{
    //making a student list object
    Student student = new Student();
    int i = 0;
    Scanner scanner = new Scanner(System.in);
    String keyboard = scanner.nextLine();
    static ArrayList <String> FirstName = new ArrayList <String>();

    public static void setMenu(){
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
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            selection = input;

            //checks for each of the appropriate values, otherwise returns an error
            if (selection.equals("1")){
                //prints Adding Student...
                System.out.println("Adding Student...");
                System.out.println("What is the student's first name?");
                Scanner scanner2 = new Scanner(System.in);
                String input2 = scanner2.nextLine();
                FirstName.add(input2);
                System.out.println(FirstName);

                //System.out.println();
            }

            else if(selection.equals("2")){

                //StudentList.deleteStudentFromList();
            }
            else if (selection.equals("3")){
                //StudentList.editStudentList();
            }
            else if (selection.equals("4")){ 
                //StudentList.clearList(input);
            }
            else if (selection.equals("5")){
                //StudentList.printStudentList();
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

