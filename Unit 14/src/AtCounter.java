//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
	private char[][] atMat;
   private int atCount;
	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}
	public int countAts(int r, int c)
	{
		if (atMat[r][c] == '@'){
			atMat[r][c] = 'x';
			atCount++;
			int newR = 0;
			int newC = 0;
			if(r!=9){
				newR = r+1;
				countAts(newR,c);
			}
			if(r!=0){
				newR = r-1;
				countAts(newR,c);
			}
			if (c!=9){
				newC = c+1;
				countAts(r,newC);
			}
			if(c!=0){
				newC = c-1;
				countAts(r,newC);
			}
		}
		return atCount;
	}
	public int getAtCount()
	{
		return atCount;
	}
	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}