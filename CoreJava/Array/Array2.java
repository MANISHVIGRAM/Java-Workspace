package Array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {1,2,3,4,5,6,7,8,9,10};
		for (int i =0; i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" = is EVEN NUMBER");
			}
		}
		System.out.println("*************");
		for (int i =0; i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]+" = is ODD NUMBER");
			}
		}
		System.out.println();
		for(int n:a)
		{
			System.out.println(n);
		}
	}

}
