package WhileLoop;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 370,sum=0,temp=num;
		while(num >0) {
			int rem=num%10;
	//		rem = rem*rem*rem;
			sum = sum + rem*rem*rem;;
			num = num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is an AMSTRONG NUMBER");
		}
		else {
			System.out.println(temp+" is not an AMSTRONG NUMBER");
		}
	}

}
