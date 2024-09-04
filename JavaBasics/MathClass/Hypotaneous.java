package MathClass;

import java.util.Scanner;
public class Hypotaneous {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double x;
		double y;
		double z;
		System.out.println("Enter the no of side x = ");
		x = scanner.nextDouble();
		System.out.println("Enter the no of side y = ");
		y = scanner.nextDouble();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotaneous is "+z);

	}

}
