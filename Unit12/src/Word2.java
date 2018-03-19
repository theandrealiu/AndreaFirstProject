import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for (int i = 0; i < vowels.length(); i++){
			for (int j = 0; j < word.length(); j++){
				if (word.charAt(j) == vowels.charAt(i)){
					vowelCount++;
				}
			}
		}
		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{
		if (rhs.numVowels() < this.numVowels()){
			return 1;
		}
		else if (rhs.numVowels() > this.numVowels()){
			return -1;
		}
		else{
			for (int i = 0; i < word.length(); i++){
				if ((int)word.charAt(i) > (int)rhs.toString().charAt(i)){
					return 1;
				}
				else if ((int)word.charAt(i) < (int)rhs.toString().charAt(i)){
					return -1;
				}
			}
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}