package WhileLoop;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 67890;
		int c = 0;
		while ( n>0 ) {
			c++;
			n = n / 10;
		}
		System.out.println(c);
	}

}
