package Array;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {10,20,30,40,50};
		for(int z:a)
		{
			System.out.println(z);
		}
		int s =0;
		//FOR EACH
		for (int b:a) 
		{
			s+=b;
		}
		System.out.println(s);
		System.out.println(Arrays.toString(a));
	}

}
