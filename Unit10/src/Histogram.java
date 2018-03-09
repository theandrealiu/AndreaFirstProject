//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
	}

	public Histogram(char[] values, String fName)
	{
		this();
		fileName = fName;
		for(int i = 0; i < values.length; i++){
			letters.add(values[i]);
		}
		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		int counter;
		String s;
		for(int i = 0; i<letters.size(); i++){
			counter = 0;
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNextLine()){
				s= file.nextLine();
				for(int j = 0; j <s.length(); j++){
				if (s.charAt(j)== letters.get(i)){
					counter++;
				}
				}
			}
			count.add(counter);
		}
	}

	public char mostFrequent()
	{
		int index = 0;
		for (int i = 1; i<count.size(); i++){
			if (count.get(index) < count.get(i)){
				index = i;
			}
		}
		char c = letters.get(index);
		return c;
	}

	public char leastFrequent()
	{
		int index = 0;
		for (int i = 1; i<count.size(); i++){
			if (count.get(index) > count.get(i)){
				index = i;
			}
		}
		char c = letters.get(index);
		return c;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}