
public class WarmUp
{
     public static void main(){
      String s1 = "e";
      String s2 = "This week is homecoming wEEk";
      System.out.println(strOcurs(s1,s2));
    }

    public static int strOcurs(String a , String b){
      String a1 = a.toLowerCase();
      String b1 = b.toLowerCase();
      int i = 0;
      int returnStatement = 0;
      while (i<b1.length()){
          if(b1.charAt(i) == a1.toCharArray()[0]){
              returnStatement++;
            }
          i++;
        }
        return returnStatement;
    }
}
