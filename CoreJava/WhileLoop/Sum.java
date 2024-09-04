package WhileLoop;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 56789,sum=0;
		while(num>0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.print("sum of the digits = "+ sum);

	}

}
