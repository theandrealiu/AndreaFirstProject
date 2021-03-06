//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
	public Maze()
	{
	}
	public Maze(int size, String line)
	{
		maze = new int[size][size];
		for (int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
				maze[i][j] = (int)(line.charAt(((i * size) + j) * 2) - 48);
			}
		}
	}
	public boolean hasExitPath(int r, int c)
	{
		if (maze[r][c] == 1){
			maze[r][c] = 0;
		}
		if (c == maze.length - 1){
			return true;
		}
		else{
			if (r != 0 && maze[r - 1][c] == 1 && hasExitPath(r - 1, c)){
				return true;
			}
			if (c != 0 && maze[r][c - 1] == 1 && hasExitPath(r, c - 1)){
				return true;
			}
			if (c != maze.length - 1 && maze[r][c + 1] == 1 && hasExitPath(r, c + 1)){
				return true;
			}
			if (r != maze[0].length - 1 && maze[r + 1][c] == 1 && hasExitPath(r + 1, c)){
				return true;
			}
		}
		return false;
	}
	public String toString()
	{
		String output="";
		for (int i = 0; i < maze.length; i++){
			for (int j = 0; j < maze.length; j++){
				output += maze[i][j];
			}
			if (i != maze.length - 1){
				output += "\n";
			}
		}
		return output;
	}
}