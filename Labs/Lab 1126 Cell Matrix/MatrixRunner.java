
/**
 * 
 * 
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class MatrixRunner{
    public static void main(){
      CellMatrix cm = new CellMatrix(3, 4);
      CellMatrix sm = new CellMatrix(3, 4);
      System.out.println("Loading matrix...");
      cm.loadMatrix();
      System.out.println("Loading sum...");
      sm.loadSum(cm);
      System.out.println("Printing cm matrix...");
      cm.printMatrix();
      System.out.println("Printing sm matrix...");
      sm.printMatrix();
      System.out.println("Printing greatest Neighbor...");
      System.out.println(sm.getGreatestNeighbors());
    }
}
