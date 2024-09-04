package WhileLoop;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 34549,palin = 0, temp = num;
		while(num>0) {
			int rem = num%10;
			palin=palin*10+rem;
			num = num /10;
		}
		if(temp == palin) {
			System.out.print(palin + " is a palindrome ");

		}
		else {
			System.out.print(palin + " is not a palindrome ");

		}
	}

}
