//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		
		roman = rom;
	}

	public Integer getNumber()
	{
		int decimal = 0;
		int lastdec = 0;
		int index = 0;
		for (int x = roman.length()-1;x>=0;x--){
			char character = roman.charAt(x);
			for (int i = 0; i < createcharlist(LETTERS).length;i++){
				if(createcharlist(LETTERS)[i]==character){
					index = i;
				}
			}
			decimal = Decimalcheck(NUMBERS[index], lastdec, decimal);
			lastdec = NUMBERS[index];
		}
		return decimal;
		}
	public int Decimalcheck(int decimal, int lastdec, int lastDecimal){
		if (lastdec > decimal){
			return lastDecimal-decimal;
		}
		else{
			return lastDecimal + decimal;
		}
		
		}
	public char[] createcharlist(String[] str){
		char[] finalcharlist = new char[str.length];
		for (int i = 0; i <str.length; i++){
			finalcharlist[i] = str[i].charAt(0);
			if (i%2!=0){
				finalcharlist[i] = 'A';
			}
			
		}
		return finalcharlist;
	}
		
		
	

	public String toString()
	{
		int n = number;
		roman = "";
		for(int i = 0; i< NUMBERS.length; i++){
			while(NUMBERS[i] <= n){
				roman = roman + LETTERS[i];
				n = n-NUMBERS[i];
			}
		
	}
		return roman + "\n";
	}
}
