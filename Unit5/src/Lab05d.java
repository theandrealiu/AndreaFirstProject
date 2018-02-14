//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		test = new CharacterAnalyzer(letter);
		out.println(test);   //1
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		test = new CharacterAnalyzer(letter);
		out.println(test);   //a
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		test = new CharacterAnalyzer(letter);
		out.println(test);   //7
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		test = new CharacterAnalyzer(letter);
		out.println(test);   //D
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		test = new CharacterAnalyzer(letter);
		out.println(test);   //2
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		test = new CharacterAnalyzer(letter);
		out.println(test);   //X
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		test = new CharacterAnalyzer(letter);
		out.println(test);   //z
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		test = new CharacterAnalyzer(letter);
		out.println(test);   //9

		//add more test cases
		
		
		
		
		
		
		
		

	}
}