//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!\n\n");
		Class userclass;
		Scanner file = new Scanner(new File("/Users/theandrealiu/Desktop/AP CSA/Unit11/src/gradebook.dat"));
		String classname = file.nextLine();
		int classnum = Integer.parseInt(file.nextLine());
		userclass = new Class(classname, classnum);
		for (int i = 0; i < classnum; i++){
			Student stu = new Student(file.nextLine(), file.nextLine());
			userclass.addStudent(i, stu);
		}
		
		out.println(userclass + "\n");
		out.println("Failure List = " + userclass.getFailureList(65));
		
		












	}		
}