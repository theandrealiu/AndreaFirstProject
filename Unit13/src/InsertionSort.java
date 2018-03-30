//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//modfiers
	public void add( String  word)
	{
		int location = Collections.binarySearch(list, word);
		if (location < 0){
			list.add(Math.abs((location + 1)), word);
		}
	}


	public void remove(String word)
	{
		list.remove(word);
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < list.size(); i++){
			output += list.get(i) + " ";
		}
		return output;
	}
}