package Recurrsion;

public class Factorial {

		static int fact(int n) {
			if(n==0||n==1) {
				return 1;
			}
			else {
				return n * fact(n-1);
				
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=fact(8);
		System.out.println("Factorial of 8 = "+ f);
	}

}
