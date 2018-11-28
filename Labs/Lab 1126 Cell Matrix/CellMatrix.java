
public class CellMatrix{
    /**
     * Instance variables
     */
    private Cell[][] cells;

    /**
     * Constructor
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];
    }

    /**
     * Methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
        for(int a = 0; a<cells.length;a++){
            for(int b = 0; b<cells[0].length;b++){
                System.out.print(cells[a][b].getInt() + " ");
            }
            System.out.println( );
        }
    }
    //Print the sum for each of the cells
    public void printSumMatrix(){
        for(int a = 0; a < cells.length; a++){
            for(int b = 0; b < cells[0].length; b++){
                System.out.print(cells[a][b].getInt() + " ");
            }
            System.out.println( );
        }
    }

    //  load nums with random numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for(int a = 0; a<cells.length;a++){
            for(int b = 0; b<cells[0].length;b++){
                cells[a][b]=new Cell ((int) (Math.random()*10)+1);
            }
        }
    }

    public void loadSum(CellMatrix cm2){
        for(int a = 0; a < cells.length;a++){
            for(int b = 0; b < cells[0].length;b++){
                int var = 0;
                if(b > 0){
                   var = var + cm2.cells[a][b-1].getInt();
                }
                if ((b+1) < cells.length){
                    var = var + cm2.cells[a][b+1].getInt();
                }
                if (a > 0){
                    var = var + cm2.cells[a-1][b].getInt();
                }
                if ((a+1) < cells.length){
                    var = var + cm2.cells[a+1][b].getInt();
                }
               cells[a][b] = new Cell(var);
            }
        }
    }
    
    public int getGreatestNeighbors(){
        int GN = 0;
        int checkValue = 0;
        for(int a = 0; a < cells.length; a++){
            for(int b = 0; b < cells[0].length; b++){
                checkValue = cells[a][b].getInt();
                if(checkValue > GN){
                    GN = checkValue;
                }
            }
        }
        return GN;
    }
}
