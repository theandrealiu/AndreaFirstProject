//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{


	}

	public Name(String s)
	{
		name = s;

	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		String firstname = name.substring(0,name.indexOf(' '));
		return firstname;
	}

	public String getLast()
	{
		String lastname = name.substring(name.indexOf(' ')+1);
		return lastname;
	}

 	public String toString()
 	{
 		return name + '\n';
	}
}