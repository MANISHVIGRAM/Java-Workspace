package DSA;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Time Complexity for Bubble Sort is o(n^2)");
		
		int numb [] = {3,5,2,6,1,4};
		int temp=0;
		
		System.out.println("Before Sorting");
		for(int num : numb)
		{
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("***********");
		
		for(int i=0;i<numb.length;i++)
		{
			for(int j=0;j<numb.length-i-1;j++)
			{
				if(numb[j]<numb[j+1])
				{
					temp = numb[j];
					numb[j] = numb[j+1];
					numb[j+1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting");
		for(int num : numb)
		{
			System.out.print(num + " ");
		}
	}

}
