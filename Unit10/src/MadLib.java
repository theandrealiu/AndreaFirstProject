//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}
	

	public MadLib(String fileName)
	{
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNext()){
				String symbol = file.next();
				if (symbol.equals("#")){
					out.print(getRandomNoun() + " ");
				}
				else if (symbol.equals("&")){
					out.print(getRandomAdjective()+ " ");
				}
				else if(symbol.equals("@")){
					out.print(getRandomVerb()+ " ");
				}
				else{
					out.print(symbol + " ");
				}
				
			}
		}
		catch(Exception e){
			out.println("Houston, we have a problem! ");
		}
	}

	public void loadNouns()
	{	
		try{
			Scanner file = new Scanner(new File("/Users/theandrealiu/Desktop/AP CSA/Unit10Materials/Unit10-Assignments/Lab16d/nouns.dat"));
			while (file.hasNextLine()){
				nouns.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println("Unable to load nouns.");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("/Users/theandrealiu/Desktop/AP CSA/Unit10Materials/Unit10-Assignments/Lab16d/verbs.dat"));
			while (file.hasNextLine()){
				verbs.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println("Unable to load verbs.");
		}	
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("/Users/theandrealiu/Desktop/AP CSA/Unit10Materials/Unit10-Assignments/Lab16d/adjectives.dat"));
			while (file.hasNextLine()){
				adjectives.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println("Unable to load adjectives.");
		}	
	}

	public String getRandomVerb()
	{
	
		return verbs.get((int)Math.floor(Math.random()*verbs.size()));
	}
	
	public String getRandomNoun()
	{
		
		return nouns.get((int)Math.floor(Math.random()*nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		
		return adjectives.get((int)Math.floor(Math.random()*adjectives.size()));
	}		

	public String toString()
	{
		return "\n\n\n";
	}
}