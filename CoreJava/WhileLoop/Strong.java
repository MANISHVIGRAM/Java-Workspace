package WhileLoop;

public class Strong {

	static int power (int r)
	{
		int p = 1;
		for (int i =1; i<=r;i++)
		{
			p = p * i;
		}
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 145, sum = 0, temp = num;
		while(num>0 ) {
			int rem = num % 10;;
			sum = sum + power(rem);
			num = num / 10;
		}
		if(temp == sum) {
			System.out.println(sum +" is STRONG");
		}
		else {
			System.out.println(sum +" is not STRONG");

		}
	}

}
