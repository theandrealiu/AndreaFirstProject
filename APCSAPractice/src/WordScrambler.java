
public class WordScrambler {
	private String[] scrambledWords;
	public WordScrambler(){
		
	}
	public WordScrambler(String[] wordArr){
		scrambledWords = mixedWords(wordArr);
	}
	private String recombine(String word1, String word2){
		String str = "";
		str = str + word1.substring(0,word1.length()/2);
		str = str + word2.substring(word2.length()/2,word2.length());
		return str;
	}
	public String[] mixedWords(String[] words){
		String[] mixed = new String[words.length];
		for(int i = 0; i<words.length;i=i+2){
			String w1 = words[i];
			String w2 = words[i+1];
			mixed[i] =(recombine(w1,w2));
			mixed[i+1] =(recombine(w2,w1));
		}
		return mixed;
	}
	public String toString(){
		String output = "";
		for (int i = 0; i<scrambledWords.length;i++){
			output = output +scrambledWords[i] + " ";
		}
		return output;
	}
}
