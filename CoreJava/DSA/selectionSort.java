package DSA;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Time Complexity for Selection Sort is O(n^2)");
		
		int no [] = {2,3,6,5,7,1};
		int temp = 0;
		int minIndex = -1;
		
		System.out.println("Before Sorting");
		for(int n : no) 
		{
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.println("Sorting the Array");
		
		for(int i=0;i<no.length-1;i++)
		{
			minIndex=i;
			for(int j=i+1;j<no.length;j++)
			{
				if(no[minIndex]>no[j])
				{
					minIndex=j;
				}
			}
			

			temp = no[minIndex];
			no[minIndex] = no[i];
			no[i] = temp;
			
			for(int n : no) 
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
		System.out.println("After Sorting");
		for(int n : no) 
		{
			System.out.print(n+" ");
		}
		System.out.println();

	}

}
