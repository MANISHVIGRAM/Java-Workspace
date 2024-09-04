package DSA;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {3,6,2,4,1,5};
		
		System.out.println("****  Insertion sort is about shifting the values not swapping ***");
		
		System.out.println("Before Sorting");
		for(int n : num)
		{
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("Sorting the Array");
		
		for (int i=1; i<num.length;i++)
		{
			int key = num[i];
			int j = i-1;
			
			while (j>=0 && num[j]>key)
			{
				num[j+1] = num[j];
				j--;
			}
			num[j+1] = key;
			
			for(int n : num)
			{
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		System.out.println("After Sorting");
		for(int n : num)
		{
			System.out.print(n + " ");
		}

	}

}
