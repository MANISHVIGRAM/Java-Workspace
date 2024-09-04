package Array;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks []= {100,99,90,93,85};
		double c=0,s=0;
		double avg=0;
		for(int i = 0;i<marks.length;i++)	
		{
			s= s+marks[i];
			c++;
		}
		avg=s/c;
		System.out.println("total = "+s);
		System.out.println("Average= "+avg);
		System.out.println("USING FOR-EACH");
		
		for(double x:marks)
		{
			s+=x;
			c++;
		}
		System.out.println("total = "+s);
		System.out.println("Average= "+avg);
	}

}
