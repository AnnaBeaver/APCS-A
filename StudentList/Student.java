
public class Student
{
    //Instance Variables
    String firstName;
    String middleName;
    String lastName;
    int stuNumber;
    double gpa;
    
    //Setters
    //firstName, middleName, lastName, stuNumber, gpa
    public void setFullName(String s){
        firstName = s;
    }
    public void setMiddleName(String s){
        middleName = s;
    }
    public void setLastName(String s){
        lastName = s;
    }
    public void setStuNumber(int s){
        stuNumber = s;
    }
    public void setgpa(double s){
        gpa = s;
    }
    //Getters
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getStuNumber(){
        return stuNumber;
    }
    public double getgpa(){
        return gpa;
    }
}
