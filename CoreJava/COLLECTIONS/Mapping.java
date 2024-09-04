package COLLECTIONS;

import java.util.*;
public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,String> details = new HashMap();
		details.put(1,"Manish");
		details.put(2, "Vigram");
		details.put(3,"Manish");
		System.out.println(details);
		System.out.println(details.get(1));
		System.out.println(details.values());
		System.out.println(details.keySet());
	}

}
