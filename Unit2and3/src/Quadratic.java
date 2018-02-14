//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private double a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic(int quadA, int quadB, int quadC)
	{
		 a = (double)quadA;
		 b = (double)quadB;
		 c = (double)quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = (double)quadA;
		 b = (double)quadB;
		 c = (double)quadC;
 	}

	public void calcRoots( )
	{
		rootOne = ((-b) + sqrt(b*b-4*a*c))/(2*a);
		rootTwo = ((-b) - sqrt(b*b-4*a*c))/(2*a);

	}

	public void print( )
	{
		System.out.println(String.format("%.2f",rootOne));
		System.out.println(String.format("%.2f",rootTwo));

	}
}