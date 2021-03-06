//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public  Monster(){
	}
	//write an initialization constructor with an int parameter ht
	public  Monster(int ht){
		myHeight = ht;
	}
	//write an initialization constructor with int parameters ht and wt
	public  Monster(int ht, int wt){
		myHeight = ht;
		myWeight = wt;
	}
	//write an initialization constructor with int parameters ht, wt, and age
	public  Monster(int ht, int wt, int age){
		myHeight = ht;
		myWeight = wt;
		myAge = age;
	}
	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht){
		this.myHeight = ht;
	}
	public void setWeight(int wt){
		this.myWeight = wt;
	}
	public void setAge(int age){
		this.myAge = age;
	}
	//accessors - write get methods for height, weight, and age
	public int getHeight(){
		return myHeight;
	}
	public int getWeight(){
		return myWeight;
	}
	public int getAge(){
		return myAge;
	}
	//creates a new copy of this Object
	public Object clone()
	{
		return new Monster(myHeight,myWeight,myAge);
	}

	public boolean equals(Object obj)
	{
		if (this.compareTo(obj) == 0){
			return true;
		}
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(this.myHeight == rhs.myHeight){
			if(this.myWeight == rhs.myHeight){
				if(this.myAge == rhs.myAge){
					return 0;
				}
				else if (this.myAge > rhs.myAge){
					return 1;
				}
				else{
					return -1;
				}
			}
			else if (this.myWeight > rhs.myWeight){
				return 1;
			}
			else{
				return -1;
			}
		}
		else if (this.myHeight > rhs.myHeight){
			return 1;
		}
		else{
			return -1;
		}

	}

	public String toString(){
		return myHeight + " " + myWeight + " " + myAge;
	}
	
	//write a toString() method
	
	
}