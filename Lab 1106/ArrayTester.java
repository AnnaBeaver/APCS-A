
public class ArrayTester
{
    
    public static void main(){
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x< nums[y].length; x++){
                nums[y][x] = (int)(Math.random()*100)+1;
            }
        }
        System.out.println(sumAll());
        System.out.println(findGreatest());
        System.out.println(numberOfGreatest());
        System.out.println(findAvg());
    }
    static int [][] nums = new int [10][10];
    public static void loadArray(){
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x< nums[y].length; x++){
                nums[y][x] = (int)(Math.random()*100)+1;
            }
        }
    }

    public static int sumAll(){
        int returnValue = 0;
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x<nums[y].length; x++){
                returnValue = returnValue + nums[y][x];
            }
        }
        return returnValue;
    }

    public static int findGreatest(){
        int max = 0;
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x<nums[y].length; x++){
                if (max<nums[y][x]){
                    max = nums[y][x];
                }
            }
        }
        return max;
    }

    public static int numberOfGreatest(){
        int max = 0;
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x<nums[y].length; x++){
                if (max<nums[y][x]){
                    max = nums[y][x];
                }
            }
        }
        int numOfGreat=0;
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x<nums[y].length; x++){
                if (max == nums[y][x]){
                    numOfGreat++;
                }
            }
        }
        return numOfGreat;
    }

    public static double findAvg(){
        double avg = 0;
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x<nums[y].length; x++){
                avg = avg + nums[y][x];
            }
        }
        avg = avg/100.0;
        return avg;
    }
}
