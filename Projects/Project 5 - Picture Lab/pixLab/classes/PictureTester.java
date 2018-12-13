package classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("tower.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("panda.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("panda.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("panda.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("panda.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGreyscale()
  {
    Picture beach = new Picture("panda.jpg");
    beach.explore();
    beach.greyscale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture water = new Picture("panda.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("panda.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorRightToLeft()
  {
    Picture caterpillar = new Picture("panda.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("tower.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("panda.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorSnowman */
  public static void testMirrorSnowman()
  {
    Picture temple = new Picture("panda.jpg");
    temple.explore();
    temple.mirrorSnowman();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("panda.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  
  public static void testPartialCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createPartialCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testPartialCopy()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createPartialCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("tower.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testTowerEdgeDetection()
  {
    Picture swan = new Picture("tower.jpg");
    swan.explore();
    swan.towerEdgeDetection(20);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    testKeepOnlyRed();
    testKeepOnlyGreen();
    testNegate();
    testGreyscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorRightToLeft();
    testMirrorHorizontalBotToTop();
    testMirrorTemple();
    testMirrorSnowman();
    //testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    testPartialCollage();
    testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}