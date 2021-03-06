//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
		}
	public String getLetter()
	{
		String output = "";
		for (int i = 1; i <= size; i++){
			int spaces = size-i;
			int count = 0;
			for (int j = spaces; j >0;j--){
				output = output + " ";
			}
			while (count < i){
				output = output + letter;
				count = count+1;
			}
			output = output + "\n";
		}
		return output + "\n";
	}

	public String toString()
	{
		String output=getLetter();
		return output;
	}
}