
public class MultPractice {
	private int intOne;
	private int intTwo;
	
	public MultPractice(int one, int two){
		intOne = one;
		intTwo = two;
	}
	
	public String getProblem(){
		String output = "";
		output = intOne + " TIMES " + intTwo;
		return output;
	}
	
	public void nextProblem(){
		intTwo = intTwo+1;
	}
	
}
