package unit0;

import java.util.Scanner;

public class Lab0b2
{
   public static void main ( String[] args )
   {
	//define 1 variable of each of the
	//following data types
	//byte	short		int 		long
	//float	double
	//char      boolean	String

	   Scanner keyboard = new Scanner(System.in);
	//integer variables
	byte byteOne;
		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();
		
	short shortOne;
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();
		
	
	int intOne;
		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();
	long longOne;
		System.out.print("Enter a long :: ");
		longOne = keyboard.nextLong();
	
	//real variables
	float floatOne;
		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();
	double doubleOne;
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
	
	//other integer types
	char charOne;
		System.out.print("Enter a character :: ");
		charOne = keyboard.next().charAt(0);
	
	//other variables
	boolean booleanOne;
		System.out.print("Enter a boolean :: ");
		booleanOne = keyboard.nextBoolean();
	String stringOne;
		System.out.print("Enter a string :: ");
		stringOne = keyboard.toString();

	System.out.println("/////////////////////////////////");
	System.out.println("*Jim Bob                08/18/06*");
	System.out.println("*                               *");
	System.out.println("*        integer types          *");
	System.out.println("*                               *");
	System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
	System.out.println("*16 bit - shortOne = "+shortOne+"\t*");
	System.out.println("*32 bit - intOne = "+intOne+"\t*");
	System.out.println("*64 bit - longOne = "+longOne+"\t*");
	System.out.println("*                               *");
	System.out.println("*        real types          \t*");
	System.out.println("*                               *");
	System.out.println("*32 bit - floatOne = "+floatOne+"\t*");
	System.out.println("*64 bit - doubleOne = "+doubleOne+"\t*");
	System.out.println("*                               *");
	System.out.println("*      other integer types      *");
	System.out.println("*                               *");
	System.out.println("*16 bit - charOne = "+charOne+"\t\t*");
	System.out.println("*                               *");
	System.out.println("*        other types            *");
	System.out.println("*                               *");
	System.out.println("*booleanOne = "+booleanOne+"\t\t*");
	System.out.println("*stringOne = "+stringOne+"\t*");
	System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

	
	
	
   }
}
