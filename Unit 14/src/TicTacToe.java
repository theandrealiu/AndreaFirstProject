import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
	}

	public TicTacToe(String game)
	{
		int character = 0;
		mat = new char[3][3];
		for (int i = 0; i < mat.length; i++){
			for (int j = 0; j < mat.length; j++){
				mat[i][j] = game.charAt(character);
				character++;
			}
		}
	}

	public String getWinner()
	{
		int diagonal1 = 0;
		int diagonal2 = 0;
		for (int i = 0; i < mat.length; i++){
			if (mat[i][0] + mat[i][1] + mat[i][2] == 264){
				return "X wins horizontally!";
			}
			if (mat[i][0] + mat[i][1] + mat[i][2] == 237){
				return "O wins horizontally!";
			}
			if (mat[0][i] + mat[1][i] + mat[2][i] == 264){
				return "X wins vertically!";
			}
			if (mat[0][i] + mat[1][i] + mat[2][i] == 237){
				return "O wins vertically!";
			}
			diagonal1 += mat[i][i];
			diagonal2 += mat[i][mat.length - 1 - i];
			if (diagonal1 == 264 || diagonal2 == 264){
				return "X wins diagonally!";
			}
			if (diagonal1 == 237 || diagonal2 == 237){
				return "O wins diagonally!";
			}
		}
		return "cat's game - no winner!";
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < mat.length; i++){
			for (int j = 0; j < mat.length; j++){
				output += mat[i][j] + " ";
			}
			output += "\n";
		}
		output += getWinner();
		return output+"\n\n";
	}
}