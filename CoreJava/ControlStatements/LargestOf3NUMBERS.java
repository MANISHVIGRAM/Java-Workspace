package ControlStatements;

public class LargestOf3NUMBERS {
	static void largest(int a,int b,int c) {
		System.out.println((a>b)&&(a>c) ? a : (b>c) ? b : c +" is the largest");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------");
		largest(33,22,11);
		System.out.println("------------------");

	}

}
