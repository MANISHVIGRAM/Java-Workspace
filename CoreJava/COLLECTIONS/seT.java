package COLLECTIONS;

import java.util.*;
public class seT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> names = new HashSet<>();
		names.add("Manish");
		names.add("Showmi");
		names.add("Dharshini");
		names.add("Manish");
		names.add("Vigram");
		names.add("Anish");
		System.out.println(names);
		Set <String> name = new LinkedHashSet<>();
		name.add("Manish");
		name.add("Showmi");
		name.add("Dharshini");
		name.add("Manish");
		name.add("Vigram");
		name.add("Anish");
		System.out.println(name);
		Set <String> names1 = new TreeSet<>();
		names1.add("Manish");
		names1.add("Showmi");
		names1.add("Dharshini");
		names1.add("Manish");
		names1.add("Vigram");
		names1.add("Anish");
		System.out.println(names1);
		int a[] = {1,2,2,3};
		Set <Integer> s2 = new LinkedHashSet<>();
		s2.add(a[0]);
		s2.add(a[1]);
		s2.add(a[2]);
		s2.add(a[3]);
		System.out.println(s2);
		System.out.println(s2.size());
		Set <Integer> s = new LinkedHashSet<>();
		s.add(2);
		s.add(5);
		s.add(1);
		s.add(2);
		s.add(0);
		s.add(8);
		s.add(12);
		System.out.println(s);
		Set <Integer> s1 = new HashSet<>();
		s1.add(2);
		s1.add(5);
		s1.add(1);
		s1.add(2);
		s1.add(0);
		s1.add(8);
		s1.add(12);
		System.out.println(s1);
		Set <Integer> s11 = new TreeSet<>();
		s11.add(2);
		s11.add(5);
		s11.add(1);
		s11.add(2);
		s11.add(0);
		s11.add(8);
		s11.add(12);
		System.out.println(s11);
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		Set <Integer> set = new TreeSet<>();
		for(int i=0; i<nums.length;i++)
        {
            set.add(nums[i]);
        }
		System.out.println(set);
		System.out.println(set.size());
		int n1=9,n2=11;
		System.out.println(++n1 + n1++);
	}

}
