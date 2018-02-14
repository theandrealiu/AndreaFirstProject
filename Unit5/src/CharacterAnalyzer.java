//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer{

	private char theChar;

	public CharacterAnalyzer()
	{


	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (Character.isUpperCase(theChar)){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isLower( )
	{
		if (Character.isLowerCase(theChar)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		if (Character.isDigit(theChar)){
			return true;
		}
		else{
			return false;
			}
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{
		if (isUpper() == true){
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		}
		if (isLower() == true){
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		}
		if (isNumber() == true){
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		} 
		else{
			return "true";
		}
	

}
}