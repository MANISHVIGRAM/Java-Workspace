package TwoDImensionARRAYLIST;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> dinner = new ArrayList<>();
		ArrayList<String>food = new ArrayList<String>();
		food.add("idly");
		food.add("rice");
		food.add("dosa");
		ArrayList<String>juice = new ArrayList<String>();
		juice.add("pepsi");
		juice.add("coc");
		ArrayList<String>sides = new ArrayList<String>();
		sides.add("egg");
		dinner.add(food);
		dinner.add(juice);
		dinner.add(sides);
		//System.out.println(dinner.get(0).get(2));	
		System.out.println(dinner);
	}

}
