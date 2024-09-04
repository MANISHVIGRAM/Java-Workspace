package ArrayList;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		food.add  ("idly");
		
		food.add("Briyani");
		
		food.add("Curd rice");
		
		food.set(0,"Pizza");
		//food.remove(0);
		//food.clear();
		for (int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
	}

}
