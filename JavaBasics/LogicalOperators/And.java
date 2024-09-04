package LogicalOperators;

public class And {

	public static void main(String[] args) {
		int temp = 22;
		if(temp >= 25) {
			System.out.println("It is hot outside");
		}
		else if (temp>=20 && temp <=25) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold");
		}

	}

}
