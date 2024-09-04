package ControlStatements;

class NestedIFELSE {

	public static void main(String[] args) {
		int pin = 5432;
		if(pin==5431) 
		{
			double accbal = 3000.0;
			double amt = 1500.0;
			if(amt<=3000 && amt>0) {
				System.out.println("Witndrawal amt = "+amt);
				System.out.println("Available Balance = "+(accbal - amt));
			}
			else{
				System.out.println("Insufficient Balance");
			}			 
		}
		else {
			System.out.println("Invalid PIN NUMBER");

		}
	}

}
