//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int num)
	{
		int count = 0;
		while (num > 0){
			num /= 10;
			count ++;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int num)
	{
		int[] sorted = new int[getNumDigits(num)];
		int index = 0;
		while (num > 0){
			sorted[index] = num % 10;
			index++;
			num /= 10;
		}
		for (int i = 0; i < sorted.length; i++){
			for (int j = 0; j < sorted.length - 1; j++){
				if (sorted[j] > sorted[j + 1]){
					int temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
				}
			}
		}
		return sorted;
	}
}