//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;


	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = (double)x1;
		yOne = (double)y1;
		xTwo = (double)x2;
		yTwo = (double)y2;


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{



	}

	public void calcDistance()
	{
		distance = sqrt((yTwo-yOne)*(yTwo-yOne) + (xTwo-xOne)*(xTwo-xOne));


	}

	public void print( )
	{
		System.out.print("The distance is ");
		System.out.println(String.format("%.3f",distance));


	}
}