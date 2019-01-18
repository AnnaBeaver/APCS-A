
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    int nums[];  //declaration

    
    // Constructor
    public StatTester(){

    }

    //  Methods
    public void loadArray(){
        nums = new int[100]; //initialization
        for(int i = 0; i < nums.length; i++){ //length 10
         nums[i] = (int)(Math.random()*10 + 1);
        }
    }

    public void printArray(){
        for(
    }//10 numbers per line
    public int getSum(){
        int sum = 0;
        for (int i = 0; i<nums.length; i++){
            sum = sum + nums [i];
            
        }
        System.out.println(sum);}
    // public double getMean(){}
    // public double getMedian(){}
    //public int[] getMode(){}

        
    
}

