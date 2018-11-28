
//Printing text is to make sure that each step is completed
public class MatrixRunner{
    public static void main(){
        //Cell Matrix of random numbers
      CellMatrix cm = new CellMatrix(3, 4);
        //Cell Matrix of sums
      CellMatrix sm = new CellMatrix(3, 4);
      System.out.println("Loading matrix...");
        //loads CM with random numbers
      cm.loadMatrix();
      System.out.println("Loading sum...");
        //loads the SM matrix with the sum of it's nighbors in the CM matrix
      sm.loadSum(cm);
      System.out.println("Printing cm matrix...");
        //Print the CM Matrix
      cm.printMatrix();
      System.out.println("Printing sm matrix...");
        //Prints the SM Matrix
      sm.printMatrix();
      System.out.println("Printing greatest Neighbor...");
        //Prints the result of getGreatestNeighbors, which is the largest value in SM
      System.out.println(sm.getGreatestNeighbors());
    }
}
