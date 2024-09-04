package WhileLoop;

public class Check_SPY_NUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			for(int i=1;i<=100;i++) {
				int numb = i;
				int sum=0,prod=1;
					while(numb>0) {
						int rem = numb%10;
						sum = sum+rem;
						prod = prod * rem;
						numb = numb/10;
				}
					if(sum == prod) {
						System.out.println("* "+ i +" is an SPY NUMBER");
						//System.out.println();
						}
			}
				
		}

}