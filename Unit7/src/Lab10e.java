//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String again;
		do{
		System.out.print("Guessing Game -- how many numbers? ");
		int response;
		response = keyboard.nextInt();
		GuessingGame game = new GuessingGame(response);
		game.playGame();
		out.println(game);
		System.out.print("Do you want to play again? ");
		again = keyboard.next();
		}while(again.equals("y"));
		



	}
}