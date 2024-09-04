package DSA;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Time Complexity for linear search is O(n)");
		
		int nums[]= {1,2,3,4,5,6,7,8,9};
		int target = 9;
		for(int i = 0; i<nums.length;i++)
		{
			if(nums[i]==target)
			{
				System.out.println(nums[i] + " is in index = "+i);
			}
			else
			{
				System.out.println("Target not found!");
			}
		}
	}

}
