import java.util.Arrays;

/**
 * Write a description of class ArrayClass here.
 * Anna
 * Test 1 Review/Homework
 */
public class ArrayClass
{
    public static void main(){
        //Problem 12
        int Array[]; //declaration for 12
        Array = new int[4];//initialization
        
        //Problem 13
        for(int i = 0; i<Array.length; i++){
            Array[i] = (int)(Math.random()*10 +1);
        }
        System.out.println(Arrays.toString(Array));
        
        //Problem 14
        int sum = 0;
        for (int i = 0; i<Array.length; i++){
            sum = sum + Array[i];
        }
        System.out.println (sum);
        
        //Problem 15
        int NewArray[];//declaration
        NewArray = Array;
        System.out.println(Arrays.toString(NewArray));
    }
}

