package Array;
//ARRAY
//*Array is used store elements
//Array  is collection of objects
// Array is an object.

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3,4,5,6,7,8,9};
		System.out.println(a[0]);
		//System.out.println(Arrays.toString(a));
		
		int [] b = {1,2,3};
		System.out.println(b[2]);
		
		int [] c = new int [4];
		c[0]=1;
		c[1]=2;
		c[2]=3;
		c[3]=4;
		System.out.println(c[3]);
		
		int d []  = new int[] {9,8,7,6,5,4,3,2,1};
		for (int i = 0;i<d.length;i++)
		{
			System.out.print(d[i]+"  ");
		}
		System.out.println();
		for (int i = d.length-1;i>=0;i--)
		{
			System.out.print(d[i]+"  ");
		}
	}

}
