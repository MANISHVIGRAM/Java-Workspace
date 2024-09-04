package Recurrsion;

public class Numbers1_10 {
	static void print(int n) {
		if(n<=10) {
			System.out.println(n);
			n++;
			print(n);
		}
	}

	public static void main(String[] args) {
		// A method which calls itself.....
		print(1);

	}

}
