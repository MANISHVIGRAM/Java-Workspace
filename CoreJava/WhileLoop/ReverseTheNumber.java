package WhileLoop;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7894561;
		
		while(n>0) {
			int rem = n%10;
			System.out.print(rem);
			n = n/10;
		}
	}

}
