package COLLECTIONS;

import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(35);
		al.add(14);
		al.add(5);
		al.add(1);
		//to retrieve elements
		System.out.println(al);
		//retrieval using FOR-EACH
		System.out.println("retrieval using FOR-EACH");
		for(int x:al)
		{
			System.out.println(x);
		}
		//retrieval using ITERATOR
		System.out.println("retrieval using ITERATOR");
		Iterator i1 = al.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}
