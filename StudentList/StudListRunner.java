import java.util.*;
public class StudListRunner
{
    int input;
    //making a student list object
    StudentList studentList = new StudentList();
    //making the menu
    public static void setMenu(){
        while (1 == 1){
        //setMenu
        System.out.println(" ");
        System.out.println("1.) add Student to List");
        System.out.println("2.) Delete Student from List");
        System.out.println("3.) Edit Student List");
        System.out.println("4.) Clear List");
        System.out.println("5.) Print List");
        System.out.println("6.) Print Student Profile");
        System.out.println("7.) Quit Menu");
        System.out.print("Please type one of the numbers ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(input== "1" || input== "2" || input=="3" || input=="4" || input=="5" || input=="6" || input=="7" ){
            if (input == "1"){
                StudentList.addStudent(input);
            }
            else if(input == "2"){
                StudentList.deleteStudentFromList();
            }
            else if (input == "3"){
                StudentList.editStudentList();
            }
            else if (input == "4"){ 
                StudentList.clearList(input);
            }
            else if (input == "5"){
                StudentList.printStudentList();
            }
            else if (input == "6"){
                StudentList.printStudent();
            }
        }
        System.out.println("Not a valid input. Please try again");
    }
}
}
