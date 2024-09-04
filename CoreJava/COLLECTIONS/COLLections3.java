package COLLECTIONS;

import java.util.*;
public class COLLections3 {
	public static void main(String[] args) {
		Collection <Integer> num1 = new ArrayList<>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(5);
		for(Integer x:num1)//AUTOBOXING
		{
			System.out.println(x);
		}
		System.out.println();
		for(int a :num1)//AUTO UNBOXING
		{
			System.out.println(a);
		}
		System.out.println("num1= "+num1);
		Collection <Integer> num2 = new ArrayList<>();
		num2.add(2);
		num2.add(3);
		num2.add(6);
		num1.addAll(num2);
		System.out.println("num1= "+num1);
		//num1.removeAll(num2);
		num1.retainAll(num2);
		System.out.println("num1= "+num1);
		
	}

}
