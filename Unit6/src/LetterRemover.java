//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int i = 0;
		String cleaned = "";
		while (i < sentence.length()){
			if (sentence.charAt(i) != lookFor){
				cleaned = cleaned + sentence.charAt(i);	
				i++;
			}
			else{
				cleaned= cleaned;
				i++;
			}
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}