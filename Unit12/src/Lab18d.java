//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/theandrealiu/Desktop/AP CSA/Unit12/src/lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] output = new Word[size];
		int count = 0;
		while (file.hasNextLine()){
			String wrd = file.nextLine();
			System.out.println(wrd);
			output[count] = new Word(wrd);
			count++;
		}
		System.out.println();
		for (int n = 0; n<output.length;n++ ){
			for (int i = n; i<output.length-1;i++){
				if(output[n].compareTo(output[i+1]) == -1){
					Word temp = output[n];
					output[n] = output[i + 1];
					output[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i<output.length;i++){
			System.out.println(output[i]);
		}
	}
}