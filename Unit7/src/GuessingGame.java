//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		int num = (int)(Math.random() * upperBound + 1);
		Scanner keyboard = new Scanner(System.in);
		int guess = 0;
		int count = 0;
		
			do{
			System.out.println("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
			if (guess < 1){
				System.out.println("Number out of bounds!");
			}
			if (guess > upperBound){
				System.out.println("Number out of bounds!");
			}
			else{
				count++;
			}
			}while (guess != num);
		
		System.out.println("The answer is " + num);
		double wrong = (((count-1)*100)/upperBound);
		System.out.println("You guessed wrong " + wrong + " percent of the time.");
	}

	public String toString()
	{
		String output="";
		return output;
	}
}