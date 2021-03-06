package classes;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 */
public class Picture extends SimplePicture {
  //Constructors
  public Picture (){
      super();
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName){
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width){
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture){
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image){
    super(image);
  }
  
  // Methods
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString(){
    String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setBlue(0);
      }
    }
  }
  
  /**Method to only keep the Blue values */
  public void keepOnlyBlue(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /**Method to only keep the Green values */
  public void keepOnlyGreen(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setRed(0);
        pixelObj.setBlue(0);
      }
    }
  }
  
  /**Method to only keep the Red values */
  public void keepOnlyRed(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /**Method to switch all values to their opposite */
  public void negate(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        int r = pixelObj.getRed();
        pixelObj.setRed(255-r);
        int g = pixelObj.getGreen();
        pixelObj.setGreen(255-g);
        int b = pixelObj.getBlue();
        pixelObj.setBlue(255-b);
      }
    }
  }
  
  /*** Method to make all values an appropirate shade of grey */
  public void greyscale(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        int r = pixelObj.getRed();
        int g = pixelObj.getGreen();
        int b = pixelObj.getBlue();
        int c = (r+g+b)/3;
        pixelObj.setRed(c);
        pixelObj.setGreen(c);
        pixelObj.setBlue(c);
      }
    }
  }
 
  /*** Method to make the fish easier to see */
  public void fixUnderwater(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        int b = pixelObj.getBlue();
        int r = pixelObj.getRed();
        if(b>100){
          pixelObj.setBlue(b-70);  
        }
        if(r<23){
          pixelObj.setRed(150);  
        }
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++){
      for (int col = 0; col < width; col++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorHorizontal(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel;
    Pixel bottomPixel;
    int height = pixels.length;
    for (int row = 0; row < height; row++){
      for (int col = 0; col < pixels[0].length; col++){
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorHorizontalBotToTop(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel;
    Pixel bottomPixel;
    int height = pixels.length;
    for (int row = 0; row < height/2; row++){
      for (int col = 0; col < pixels[0].length; col++){
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple(){
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    // loop through the rows
    for (int row = 27; row < 97; row++){
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++){
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
        [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count ++;
      }
    }
    
  }
  
  /** Mirror just part of a picture of a snowman */
  public void mirrorSnowman(){
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    // loop through the rows
    for (int row = 158; row < mirrorPoint; row++){
      // loop from 13 to just before the mirror point
      for (int col = 103; col < 170; col++){
        topPixel = pixels[row][col];      
        bottPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottPixel.setColor(topPixel.getColor());
      }
    }
    int mirrorPoint2 = 198;
    Pixel topPixel2 = null;
    Pixel bottPixel2 = null;
    // loop through the rows
    for (int row = 171; row < mirrorPoint2; row++){
      // loop from 13 to just before the mirror point
      for (int col = 239; col < 294; col++){
        topPixel2 = pixels[row][col];      
        bottPixel2 = pixels[mirrorPoint2 - row + mirrorPoint2][col];
        bottPixel2.setColor(topPixel2.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol){
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length &&toRow < toPixels.length; fromRow++, toRow++){
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length &&toCol < toPixels[0].length;  fromCol++, toCol++){
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  /** Method to create a collage of several pictures */
  public void createCollage(){
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  
  public void PartialCopy(Picture fromPic, int startRow, int endRow, int startCol, int endCol){
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++){
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < endCol;  fromCol++, toCol++){
        fromPixel = fromPixels[fromRow][fromCol];
        //the line below this causes the problem
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  /** Method to create a collage of several pictures */
  public void createPartialCollage(){
    Picture flower1 = new Picture("arch.jpg");
    Picture flower2 = new Picture("koala.jpg");
    this.PartialCopy(flower1,0,0, 10, 10);
    this.PartialCopy(flower2,100,0, 110, 10);
    this.PartialCopy(flower1,200,0, 210, 10);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.PartialCopy(flowerNoBlue,300,0, 310, 10);
    this.PartialCopy(flower1,400,0, 410, 10);
    this.PartialCopy(flower2,500,0, 510, 10);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist){
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    
    for (int row = 0; row < pixels.length; row++){
      for (int col = 0; col < pixels[0].length-1; col++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    Pixel upPixel = null;
    Pixel downPixel = null;
    Pixel[][] vertpixels = this.getPixels2D();
    Color downColor = null;
    for (int row = 0; row < vertpixels.length-1; row++){
      for (int col = 0; col < vertpixels[0].length; col++){
        upPixel = vertpixels[row][col];
        downPixel = vertpixels[row+1][col];
        downColor = downPixel.getColor();
        if (upPixel.colorDistance(downColor) > edgeDist){
          upPixel.setColor(Color.BLACK);
        }
        else{
          upPixel.setColor(Color.WHITE);
        }
      }
    }
  }
  
    public void towerEdgeDetection(int edgeDist){
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    int rightColor = 0;
    for (int row = 0; row < pixels.length; row++){
      for (int col = 0; col < pixels[0].length-1; col++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getBlue();
        if (leftPixel.getBlue() > 150 )
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    Pixel upPixel = null;
    Pixel downPixel = null;
    Pixel[][] vertpixels = this.getPixels2D();
    int downColor = 0;
    for (int row = 0; row < vertpixels.length-1; row++){
      for (int col = 0; col < vertpixels[0].length; col++){
        upPixel = vertpixels[row][col];
        downPixel = vertpixels[row+1][col];
        downColor = downPixel.getBlue();
        if (upPixel.getBlue() > 150){
          upPixel.setColor(Color.BLACK);
        }
        else{
          upPixel.setColor(Color.WHITE);
        }
      }
    }
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
} // this } is the end of class Picture, put all new methods before this
