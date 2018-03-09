//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	double[] Grades = {};
	private int len;
public String setGrades(int length,double[] Input){
	Grades = Input;
	len = length;
	String output = "";
	for (int i = 0; i < len;i++){
		output = output + ("grade " + i + ": "+ Grades[i] + "\n");
	}
	return output;
}
	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i<len;i++){
			sum = sum + Grades[i];
		}
		return sum;
	}
	public String getAverage()
	{
		double average=0.0;
		average = getSum()/len;
		return String.format("%.2f\n", average);
	}
public String toString(){
	return setGrades(len,Grades) + "\n" + "average: " + getAverage() + "\n\n";
	}
}