//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/theandrealiu/Desktop/AP CSA/Unit 14/src/lab21i.dat"));
		while (file.hasNextLine()){
			Maze maze = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
			out.println(maze);
			if (maze.hasExitPath(0, 0) == true){
				out.println("exit found");
				out.println();
			}
			else{
				out.println("exit not found");
				out.println();
			}
		}
	}
}