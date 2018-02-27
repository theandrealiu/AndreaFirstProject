//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		Grades grade = new Grades();
		double[] array = {100,90,85,72.5,95.6};
		grade.setGrades(5, array);
		System.out.println(grade);
		grade = new Grades();
		array = new double[]{50.0, 100.0, 80.0};
		grade.setGrades(3, array);
		System.out.println(grade);
		
		grade = new Grades();
		array = new double[]{93.4, -90.0, 90.0};
		grade.setGrades(3, array);
		System.out.println(grade);
		
		grade = new Grades();
		array = new double[]{1, 2, 3, 4, 5, 6, 7, 8,9};
		grade.setGrades(9, array);
		System.out.println(grade);
		
		
		
		
	}
}