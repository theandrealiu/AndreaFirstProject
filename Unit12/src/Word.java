//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}
	public String getString(){
		return word;
	}

	public int compareTo( Word rhs )
	{
		if (word.length() < rhs.toString().length()){
			return 1;
		}
		else if (word.length() > rhs.toString().length()){
			return -1;
		}
		else{
			for (int i = 0; i<word.length();i++){
				if ((int)word.charAt(i) < (int)rhs.toString().charAt(i)){
					return 1;
				}
				else if ((int)word.charAt(i) > (int)rhs.toString().charAt(i)){
					return -1;
				}
			}
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}