package ControlStatements;
import java.util.*;
public class OddorEvenUsingBinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		for(int i=0;i<=num;i++) {
			if((i&1)==1) {
				System.out.println(i+" is ODD");
			}
			else {
				System.out.println(i+" is EVEN");
			}
		}
	}

}
