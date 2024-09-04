package Array;
import java.util.*;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter number of rows : ");
		int r = sc.nextInt();
		
		System.out.println("Enter number of columns : ");
		int c = sc.nextInt();
		
		int num [][] = new int [r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				num[i][j] = (int)(Math.random()*10);	
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//FOR EACH LOOP
		for(int n[]:num)
		{
			for(int m:n)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}

}
