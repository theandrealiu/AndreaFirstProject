//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover letter = new LetterRemover();
		letter.setRemover("I am Sam I am", 'a');
		out.println(letter);
		out.println(letter.removeLetters() + '\n');
		
		letter = new LetterRemover();
		letter.setRemover("ssssssssxssssesssssesss", 's');
		out.println(letter);
		out.println(letter.removeLetters() + '\n');
		
		letter = new LetterRemover();
		letter.setRemover("qwertyqwertyqwerty", 'a');
		out.println(letter);
		out.println(letter.removeLetters() + '\n');
		
		letter = new LetterRemover();
		letter.setRemover("abababababa", 'b');
		out.println(letter);
		out.println(letter.removeLetters() + '\n');
		
		letter = new LetterRemover();
		letter.setRemover("abaababababa", 'x');
		out.println(letter);
		out.println(letter.removeLetters() + '\n');
		
											
	}
}