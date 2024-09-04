package WhileLoop;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 245,sum=0,prod=1,temp=num;
		while(num>0) {
			int rem = num%10;
			sum = sum+rem;
			prod = prod * rem;
			num= num/10;
		}
		if(sum==prod) {
			System.out.println(temp + " is a SPY NUMBER");
		}
		else {
			System.out.println(temp + " is not a SPY NUMBER");

		}
	}

}
