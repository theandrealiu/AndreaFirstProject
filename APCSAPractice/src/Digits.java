import java.util.ArrayList;


public class Digits {
	
	private ArrayList<Integer> digitList = new ArrayList(0);
	private int number;
	private String output = "";
	
	public Digits(){
	}
	
	public String Digits(int num){
		number = num;
		if (number != 0){
			while (number >0){
				int dig = number%10;
				digitList.add(0,dig);
				number = number/10;
			}
		}
		else{
			digitList.add(0,0);
		}
		for (int i = 0; i <digitList.size(); i++){
			output = output + digitList.get(i) + " ";
		}
		return output;
	}
	
	public boolean isStrictlyIncreasing(){
		int i = 0;
		int count = 0;
		String output2 = "";
		while (i < digitList.size()-1){
			if(digitList.get(i) < digitList.get(i+1)){
				i++;
				count++;
				
			}
			else{
				i++;
			}
			output2 = i +" "+ count;
		}
		if (count == i){
			return true;
		}
		else{
			return false;
		}
	}
}

