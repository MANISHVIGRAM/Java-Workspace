package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PRINTING I values");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("PRINTING J values");
		for(int k=1;k<=5;k++)
		{
			for(int l=1;l<=k;l++)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
		System.out.println("PRINTING *");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("PRINTING * in reverse");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
