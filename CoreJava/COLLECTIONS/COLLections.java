package COLLECTIONS;

import java.util.*;
import java.lang.*;


public class COLLections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = new LinkedList();
		c1.add("Manish");
		c1.add("Vigram");
		for(Object o1:c1)
		{
			String name = (String)o1;
			System.out.println(name+"\t"+name.charAt(0)+"\t"+name.length());
			
		}
		Iterator itr = c1.iterator();
		while(itr.hasNext())
		{
			Object o2 = itr.next();
			String names = (String)o2;
			System.out.println(names+"\t"+names.charAt(0)+"\t"+names.length());
		}
		//String car []= {"MUSTANG","SUPRA","NISSAN GTR"};
		System.out.println("*******USING GENERICS*******");
		//GENERICS
		//It makes collection as HOMOGENEOUS
		//It was introduced in jdk 1.2
		//It can be used only for classes not for primitive data types.
		//If we use GENERICS there is no need for upcasting and downcasting
		Collection <String> cars = new LinkedList<>();
		cars.add("Mustang");
		cars.add("GTR");
		cars.add("Supra");
		for(String car : cars)
		{
			System.out.println(car);
			
		}
		System.out.println();
		Collection <Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		for(int i:num)
		{
			System.out.println(i);
		}
	}

}
