package WhileLoop;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123456789,count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
