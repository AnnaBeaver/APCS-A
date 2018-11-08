
public class ArrayTester
{
    public static void main(){
        int [][] nums = new int [10][10];
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x< nums[y].length; x++){
                nums[y][x] = (int)(Math.random()*100)+1;
                System.out.print(nums[y][x]+", ");
            }
            System.out.println();
        }
        System.out.println(sumAll(nums));
        System.out.println(findGreatest(nums));
        System.out.println(numberOfGreatest(nums));
        System.out.println(findAvg(nums));
    }
    /*
    public static void loadArray(String [][] nums){
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x< nums[y].length; x++){
                nums[y][x] = (int)(Math.random()*100)+1;
            }
        }
    }
    */
    public static int sumAll(int[][] nums){
        int returnValue = 0;
        for(int y = 0; y<nums.length; y++){
            for (int x = 0; x<nums[y].length; x++){
                returnValue = returnValue + nums[y][x];
            }
        }
        return returnValue;
    }

    public static int findGreatest(int[][] nums){
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

    public static int numberOfGreatest(int[][] nums){
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

    public static double findAvg(int[][] nums){
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
