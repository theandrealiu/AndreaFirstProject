import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/theandrealiu/Desktop/AP CSA/Unit12/src/lab18d.dat"));
		int size = file.nextInt();
		file.nextLine();
		Word2[] words = new Word2[size];
		int count = 0;
		while (file.hasNextLine()){
			String wrd = file.nextLine();
			System.out.println(wrd);
			words[count] = new Word2(wrd);
			count++;
		}
		System.out.println();
		for (int n = 0; n < words.length; n++){
			for (int i = 0; i < words.length - 1; i++){
				if (words[i].compareTo(words[i + 1]) > 0){
					Word2 temp = words[i];
					words[i] = words[i + 1];
					words[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < words.length; i++){
			System.out.println(words[i]);
		}

	}
}
