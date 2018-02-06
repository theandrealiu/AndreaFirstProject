package unit0;

import java.util.Scanner;

public class Lab0c
{
  public static void main (String[] args) 
  {
      Scanner keyboard = new Scanner(System.in);
 	
      int intTotal = 0;
      int intOne, intTwo;

    	System.out.print("Enter an integer :: ");
    	intOne = keyboard.nextInt();

    	System.out.print("Enter an integer :: ");
    	intTwo = keyboard.nextInt();
    	
    	System.out.print("\n");
    	intTotal = intOne + intTwo;
    
    	
   double doubleTotal = 0.0;
    	double doubleOne, doubleTwo;
    	
    	System.out.print("Enter a double :: ");
    	doubleOne = keyboard.nextDouble();

    	System.out.print("Enter a double :: ");
    	doubleTwo = keyboard.nextDouble();
    	
    	System.out.print("\n");
    	doubleTotal = doubleOne + doubleTwo;
    	
 
    	
    float floatOne, floatTwo;
    	
    	System.out.print("Enter a float :: ");
    	floatOne = keyboard.nextFloat();

    	System.out.print("Enter a float :: ");
    	floatTwo = keyboard.nextFloat();
    	
    	System.out.print("\n");
    	
    short shortOne, shortTwo;
    	
    	System.out.print("Enter a short :: ");
    	shortOne = keyboard.nextShort();

    	System.out.print("Enter a short :: ");
    	shortTwo = keyboard.nextShort();
    	
    	System.out.print("\n");
    	
    	
    byte byteOne, byteTwo;

    	System.out.print("Enter a byte :: ");
    	byteOne = keyboard.nextByte();

    	System.out.print("Enter a byte :: ");
    	byteTwo = keyboard.nextByte();
    	
    	System.out.print("\n");
    	
    long longOne, longTwo;

    	System.out.print("Enter a long :: ");
    	longOne = keyboard.nextLong();

    	System.out.print("Enter a long :: ");
    	longTwo = keyboard.nextLong();
    	
    	System.out.print("\n");
    	
    	System.out.print("----------------------------------\n");
    
    

	System.out.println("integer one = " + intOne);
System.out.println("integer two = " + intTwo + "\n");

System.out.println("double one = " + doubleOne);
System.out.println("double two = " + doubleTwo + "\n");

System.out.println("float one = " + floatOne);
System.out.println("float two = " + floatTwo + "\n");

System.out.println("short one = " + shortOne);
System.out.println("short two = " + shortTwo + "\n");

System.out.println("byte one = " + byteOne);
System.out.println("byte two = " + byteTwo + "\n");

System.out.println("long one = " + longOne);
System.out.println("long two = " + longTwo + "\n");

System.out.println("intOne + intTwo = "+ intTotal);
System.out.println("doubleOne + doubleTwo = "+ doubleTotal);

   }
}
