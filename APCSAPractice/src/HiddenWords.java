import java.util.ArrayList;

public class HiddenWords {
	private String word;
	public HiddenWords(String myWord){
		word = myWord;
	}
	public String getHint(String guess){
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> guesss = new ArrayList<String>();
		ArrayList<String> hints = new ArrayList<String>();
		for(int i = 0; i<word.length(); i++){
			words.add(word.substring(i,i+1));
			guesss.add(guess.substring(i,i+1));
			hints.add("*");
		}
		for (int x = 0; x<words.size(); x++){
			for(int j = 0; j<words.size(); j++){
			if(words.get(x).equals(guesss.get(x))){
				hints.set(x,word.substring(x,x+1));
			}
			else{
				if (hints.get(x).equals(words.get(j))){
					hints.set(x,"+");
					}
				}
				}
				
			}

	return hints.toString();
	}
}

