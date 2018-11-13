
public class CalcRunner
{
public static void main(){
    SimpleCalc s1 = new SimpleCalc();
    double a = s1.add(12,7);
    System.out.println(s1.add(7,4));
    System.out.println(s1.subtract(7,4));
    System.out.println(s1.multiply(7,4));
    System.out.println(s1.divide(7,4));
    System.out.println(s1.modulodivide(7,4));
}
}
