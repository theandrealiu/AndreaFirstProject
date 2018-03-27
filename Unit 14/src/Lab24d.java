//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("/Users/theandrealiu/Desktop/AP CSA/Unit 14/src/lab24d.dat"));
		int num = Integer.parseInt(file.nextLine());
		for (int i = 0; i < num; i++){
			String game = file.nextLine();
			TicTacToe test = new TicTacToe(game);
			out.println(test);
		}
	}
}



