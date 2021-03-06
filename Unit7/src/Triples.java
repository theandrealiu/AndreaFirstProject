//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;
   String output = "";
   private int A;
   private int B;
   private int C;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private boolean greatestCommonFactor(int a, int b, int c)
	{
		A = a;
		B = b;
		C = c;
		for (int i = 2; i < c; i++){
			if (A % i == 0 && B % i == 0 && C % i == 0){
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		for (int a = 1; a <= number; a++){
			if (a % 2 == 1){
				for (int b = a; b <= number; b++){
					if (b % 2 == 0){
						for (int c = b; c <= number; c++){
							if (c*c == a*a + b*b){
								if (greatestCommonFactor(a,b,c) == false){
										output = output + a + " " + b + " " + c + "\n";
												}
										}
								}
								}
							}
						}
		
					
			if (a % 2 == 0){
				for (int b = a; b < number; b++){
					if (b % 2 == 1){
						for (int c = b; c < number; c++){
								if (c*c == a*a + b*b){
									if (greatestCommonFactor(a,b,c) == false){
										output = output + a + " " + b + " " + c + "\n";
												}
								}
						}
					}
				}
			}
		}
	
		
		return output+"\n";
	}
}

