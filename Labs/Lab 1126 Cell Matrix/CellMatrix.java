
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

    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for(int a = 0; a<cells.length;a++){
            for(int b = 0; b<cells[0].length;b++){
                cells[a][b]=new Cell ((int) (Math.random()*10)+1);
            }
        }
    }

    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        Cell.sumInt = 0;
        //traverse the matrix
        for(int a = 0; a < cells.length; a++){
            for(int b = 0; b < cells[0].length; b++){
                //check left
                while((a-1) > 0){
                    Cell.neighbors[0]= new Cell(cells[a-1][b].getInt());
                    Cell.sumInt = Cell.sumInt + (Cell.neighbors[0].getInt());
                }
                //check down
                while((b-1) > 0){
                    Cell.neighbors[1]= new Cell(cells[a][b-1].getInt());
                    Cell.sumInt = Cell.sumInt + (Cell.neighbors[1].getInt());
                }
                //check right
                while((a+1) < cells.length){
                    Cell.neighbors[2]= new Cell(cells[a+1][b].getInt());
                    //Cell.sumInt = Cell.sumInt + (Cell.neighbors[2].getInt());
                }
                //check up
                while((b+1) < cells[0].length){
                    Cell.neighbors[3]= new Cell(cells[a][b+1].getInt());
                    Cell.sumInt = Cell.sumInt + (Cell.neighbors[3].getInt());
                }

                //all values have been added together into Cell.sumInt
            }
        } 
    }

    //  Finds the sum of each of the neighbors and returns the greatestneighbor value
    public int getGreatestNeighbors(){
        int GN = 0;
        int checkValue = 0;

        for(int a = 0; a < cells.length; a++){
            for(int b = 0; b < cells[0].length; b++){
                checkValue = cells[a][b].sumInt;
                if(checkValue > GN){
                    GN = checkValue;
                }
            }
        }

        return GN;
    }

}
