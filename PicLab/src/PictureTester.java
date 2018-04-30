

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
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
    Picture beach = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/beach.jpg");
    //beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	 Picture beach = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/beach.jpg");
	 //beach.explore();
	 beach.keepOnlyBlue();
	 beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	 Picture beach = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/beach.jpg");
	 //beach.explore();
	 beach.keepOnlyRed();
	 beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
	 Picture beach = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/beach.jpg");
	 //beach.explore();
	 beach.keepOnlyGreen();
	 beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/beach.jpg");
		 //beach.explore();
		 beach.negate();
		 beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/beach.jpg");
		 //beach.explore();
		 beach.grayscale();
		 beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/water.jpg");
		 //water.explore();
		 water.fixUnderwater();
		 water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/caterpillar.jpg");
    //caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/temple.jpg");
    //temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture motorcycle = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/redMotorcycle.jpg");
	    //motorcycle.explore();
	    motorcycle.mirrorVerticalRightToLeft();
	    motorcycle.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture motorcycle = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/redMotorcycle.jpg");
	    //motorcycle.explore();
	    motorcycle.mirrorHorizontal();
	    motorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture motorcycle = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/redMotorcycle.jpg");
	    //motorcycle.explore();
	    motorcycle.mirrorHorizontalBotToTop();
	    motorcycle.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/beach.jpg");
		 //beach.explore();
		 beach.mirrorDiagonal();
		 beach.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/snowman.jpg");
		 //snowman.explore();
		 snowman.mirrorArms();
		 snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/seagull.jpg");
		 //seagull.explore();
		 seagull.mirrorGull();
		 seagull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	  Picture canvas = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/640x480.jpg");
	  canvas.createCollage();
	  canvas.explore();
  }
  
  public static void testmyCollage()
  {
	  Picture canvas = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
    
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/Users/theandrealiu/Desktop/AP CSA/PicLab/src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    testKeepOnlyGreen();
    //testNegate();
    testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testmyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}

