//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
		
	public static String printWord(String word, int times)
	{
		String output = "";
		for (int i = 0; i<times; i++){
			output = output + "\n" + word;
		}
		return output;



	}
}