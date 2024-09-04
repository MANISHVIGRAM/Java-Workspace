package COLLECTIONS;
import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList  LL = new LinkedList <> ();
		LL.add("Manish");
		LL.add(22);
		LL.add("ECE STUDENT");
		LL.add(8.01);
		System.out.println(LL);
		System.out.println("retrieval using FOR-EACH");
		for (Object o1:LL) {
			System.out.println(o1);
		}
		System.out.println("retrieval using ITERATOR");
		Iterator i1 = LL.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("FOR EACH METHOD");
		LL.forEach(l-> System.out.println(l));
	}

}
