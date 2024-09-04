package scanner;

import java.util.*;
public class Array1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Set <Integer> num = new TreeSet<>();
	System.out.println("Enter the size:");
	int size = sc.nextInt();
	int[]nums = new int[size];
	for(int i=0;i<nums.length;i++) {
		System.out.println("Enter the number "+(i+1)+":");
		nums[i]=sc.nextInt();
		num.add(nums[i]);
	}
	System.out.println("NUMBER ARRAY="+num);
	}
}
