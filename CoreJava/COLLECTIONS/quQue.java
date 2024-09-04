package COLLECTIONS;
import java.util.*;
public class quQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> q = new LinkedList<>();
		q.add(9);
		q.add(7);
		q.add(1);
		q.add(8);
		q.add(4);
		System.out.println(q);
		System.out.println("SORTING THIS Q ARRAY USING priority queu");
		Queue  <Integer> pq = new PriorityQueue<>();
		pq.add(9);
		pq.add(7);
		pq.add(1);
		pq.add(8);
		pq.add(4);
		System.out.println(pq);
	}

}
