package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		int [] num = new int [4];
		for (int i =0; i<num.length; i++)
		{
			System.out.println("enter num: ");
			num[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(num));

	}

}
