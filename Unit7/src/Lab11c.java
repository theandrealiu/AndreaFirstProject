//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Lab11c
{
   public static void main( String args[] )
   {
	   TriangleThree triangle = new TriangleThree();
	   triangle.setTriangle("A", 3);
	   triangle.getLetter();
	   out.println(triangle);
	   
	   triangle = new TriangleThree();
	   triangle.setTriangle("X", 7);
	   triangle.getLetter();
	   out.println(triangle);
	   
	   triangle = new TriangleThree();
	   triangle.setTriangle("R", 1);
	   triangle.getLetter();
	   out.println(triangle);
	   
	   triangle = new TriangleThree();
	   triangle.setTriangle("T", 5);
	   triangle.getLetter();
	   out.println(triangle);
	   
	   triangle = new TriangleThree();
	   triangle.setTriangle("W", 4);
	   triangle.getLetter();
	   out.println(triangle);
	}
}