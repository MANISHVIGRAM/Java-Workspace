package AssignmentKarthi;

import java.util.*;


public class beautyPageant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No.of.Contestants : ");
		int noc = sc.nextInt();
		
		int [] score = new int[noc];
		for(int i=1;i<=noc;i++)
		{
			System.out.print("Enter the score of the Contestant "+i+": ");
			int scr = sc.nextInt();
			score[i-1]=scr;
		}
		
		for(int j=0;j<score.length;j++)
		{
			System.out.println("SCORE OF CONTESTANT "+(j+1)+" : "+score[j]);
		}
		
		System.out.println("AVERAGE : "+avg(score));
		
	}
	public static int avg(int [] scr)
	{
		int sum = 0;
		int avg;
		for(int s : scr)
		{
			sum +=s;
		}
		avg = sum / scr.length;
		return avg;
	}
}
