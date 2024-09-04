package DSA;

public class binarySearch1 {

	public static void main(String[] args) {

		System.out.println("Time Complexity for Binary Search is O(logn of n)");
		
		int nums[]= {10,20,30,40,50,60,70,80,90,100};
		int target = 30;
		int start=0,value=1;
		int end = nums.length-1;
		
		while(start<=end)
		{

			System.out.println(value);
			value++;
			
			int mid = (start+end)/2;
			
			if(nums[mid]==target)
			{
				System.out.println("Target is found "+nums[mid]+" at the index "+mid);
				break;
			}
			
			else if (nums[mid]<target)
			{
				start=mid+1; 
			
			}
			else
			{
				end=mid-1;
			}
		}
	}

}
