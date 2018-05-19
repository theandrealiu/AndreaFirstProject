import java.util.ArrayList;


public class Test {
public static void main(String args[]){
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(0);
	list.add(0);
	list.add(0);
	list.add(0);
	list.add(0);
	list.add(0);
	int size = list.size();
	list.remove(2);
	System.out.println(size);
}
}
