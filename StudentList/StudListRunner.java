
public class StudListRunner
{
    int input = 0;
    //making a student list object
    StudentList studentList = new StudentList();
    //making the menu
    public static void setMenu(){
        //setMenu
        System.out.println("1.) add Student to List");
        System.out.println("2.) Delete Student from List");
        System.out.println("3.) Edit Student List");
        System.out.println("4.) Clear List");
        System.out.println("5.) Print List");
        System.out.println("5.) Print Student Profile");
        System.out.print("Please type one of the numbers ");
    }
    
    public static void getMenu(int input){
        while(input == 1){
            StudentList.addStudent();
        }
        while(input ==2){
            StudentList.deleteStudent();
        }
        while (input == 3){
            StudentList.editStudentList();
        }
        while (input == 4){ 
            StudentList.clearList();
        }
        while (input == 5){
            StudentList.printList();
        }
        while (input == 6){
            StudentList.printStudent();
        }
    }

}
