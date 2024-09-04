package PerfectNumber;

public class PerfectNo {

	public static void main(String[] args) {
			int num = 28,sum=0;
			for (int i =1;i<28;i++) {
				if(num%i==0) {
					sum = sum+i;
					System.out.println(i);
				}
			}
			if(num==sum) {
				System.out.println(num + " is perfect"+sum);

			}
			else {
				System.out.println(num+ " is not perfect") ;

			}
	}

}
