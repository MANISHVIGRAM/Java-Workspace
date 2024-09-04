package DSA;

public class binarySearch2 {
	
	public static int Search(int nums[], int tar)
	{
		int start = 0;
		int end = nums.length-1;
		while(start<=end)
		{	
			int mid = (start+end)/2;
			
			if(nums[mid]==tar)
			{
				return  mid;
			}
			
			else if (nums[mid]<tar)
			{
				start=mid+1; 
			
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] =  {1,2,3,4,5,6,7,8};
		int target = 3;
		System.out.println(Search(nums,target));
	}

}
