import java.util.ArrayList;
public class Class
{
    public Class(){
       
    }
    
    public void TransformILike (String str){
        String noun = str.substring(str.indexOf("I like ")+7);
        ArrayList<String> response = new ArrayList<String>();
        response.add("Why do you like ");
        response.add("Do you eat ");
        response.add("What are ");
        response.add("What color are ");

        int responseNum = (int)(Math.random()*4)+1;
        System.out.println(response.get(responseNum-1)+noun+"?");

    }
}
