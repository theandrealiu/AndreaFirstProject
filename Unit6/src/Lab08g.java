//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats stats = new LoopStats(1,5);
		out.println(stats);
		out.println("total: "+ stats.getTotal());
		out.println("even count: "+ stats.getEvenCount());
		out.println("odd count: "+ stats.getOddCount()+ '\n');
		
		
		stats = new LoopStats(2,8);
		out.println(stats);
		out.println("total: "+ stats.getTotal());
		out.println("even count: "+ stats.getEvenCount());
		out.println("odd count: "+ stats.getOddCount()+ '\n');
		
		stats = new LoopStats(5,15);
		
		out.println(stats);
		out.println("total: "+ stats.getTotal());
		out.println("even count: "+ stats.getEvenCount());
		out.println("odd count: "+ stats.getOddCount() + '\n');		
		//add test cases
		
		
		
		
		
					
	}
}