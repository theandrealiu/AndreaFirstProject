//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private double xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		 xOne = (double)x1;
		 yOne = (double)y1;
		 xTwo = (double)x2;
		 yTwo = (double)y2;

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{


	}

	public void calculateSlope( )
	{
		slope = (yTwo-yOne)/(xTwo-xOne);

	}

	public void print( )
	{
		System.out.print("The slope is ");
		System.out.println(String.format("%.2f",slope));	//outs 9.542



	}
}