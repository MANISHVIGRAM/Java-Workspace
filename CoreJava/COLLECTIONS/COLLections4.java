package COLLECTIONS;

import java.util.*;
public class COLLections4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> n = new ArrayList<> ();
		n.add(11);
		n.add(12);
		n.add(13);
		n.add(14);
		n.add(15);
		for(Integer x:n)
		{
			System.out.println(x);
		}
		System.out.println("**************");
		for (int a:n)
		{
			System.out.println(a);
		}
		ArrayList <Integer> n2 = new ArrayList<> ();
		n2.add(13);
		n2.add(14);
		n2.add(16);
		n.addAll(n2);
		System.out.println("n1 = "+n);
		System.out.println(n.contains(16));
		System.out.println(n.containsAll(n2));
		n.remove(7);
		System.out.println("n1 = "+n);
		//n.removeAll(n2);
		System.out.println("n1 = "+n);
		n.retainAll(n2);
		System.out.println("n1 = "+n);

	}

}
