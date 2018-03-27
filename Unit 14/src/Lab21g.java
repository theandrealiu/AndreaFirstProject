//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		AtCounter count = new AtCounter();
		//test the code
		count.countAts(0,0);
		out.println("0 0 has " + count.toString());
		
		count = new AtCounter();
		count.countAts(2,5);
		out.println("\n2 5 has " + count.toString());
		
		count = new AtCounter();
		count.countAts(5,0);
		out.println("\n5 0 has " + count.toString());
		
		count = new AtCounter();
		count.countAts(9,9);
		out.println("\n9 9 has " + count.toString());
		
		count = new AtCounter();
		count.countAts(3,9);
		out.println("\n3 9 has " + count.toString());
	}
}