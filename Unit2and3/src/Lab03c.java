//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
	Scanner keyboard = new Scanner(System.in);
	int a;
	System.out.print("Enter a :: ");
	a = keyboard.nextInt();
	int b;
	System.out.print("Enter b :: ");
	b = keyboard.nextInt();
	int c;
	System.out.print("Enter c :: ");
	c = keyboard.nextInt();
	
	Quadratic quad = new Quadratic(a,b,c);
	quad.setEquation(a,b,c);
	quad.calcRoots();
	quad.print();
	
	
	System.out.print("Enter a :: ");
	a = keyboard.nextInt();
	
	System.out.print("Enter b :: ");
	b = keyboard.nextInt();
	
	System.out.print("Enter c :: ");
	c = keyboard.nextInt();
	
	Quadratic quad2 = new Quadratic(a,b,c);
	quad2.calcRoots();
	quad2.print();
	
	
	System.out.print("Enter a :: ");
	a = keyboard.nextInt();
	
	System.out.print("Enter b :: ");
	b = keyboard.nextInt();
	
	System.out.print("Enter c :: ");
	c = keyboard.nextInt();
	
	Quadratic quad3 = new Quadratic(a,b,c);
	quad3.calcRoots();
	quad3.print();
   	
		
		
	}
}