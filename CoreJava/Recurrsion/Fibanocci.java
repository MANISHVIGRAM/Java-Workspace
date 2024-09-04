package Recurrsion;

public class Fibanocci {
	static int fib(int n) {
		if(n==1) {
			return 0;
		}
		else if (n==2||n==3) {
			return 1;
		}
		else {
			return fib(n-1)+fib (n-2);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibse= fib(10);
		System.out.println("value of fib 10 =" + fibse);
	}

}
