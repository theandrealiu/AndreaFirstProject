//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/theandrealiu/Desktop/AP CSA/Unit13/src/lab15d.dat"));
		int line = Integer.parseInt(file.nextLine());
		FancyWords[] test = new FancyWords[line];
		for (int i = 0; i < line; i++){
			test[i] = new FancyWords(file.nextLine());
		}
		for (int i = 0; i < test.length; i++){
			out.println(test[i]);
		}
	}
}