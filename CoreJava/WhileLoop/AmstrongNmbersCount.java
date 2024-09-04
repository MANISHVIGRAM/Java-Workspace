package WhileLoop;

public class AmstrongNmbersCount {
	static int prod(int n, int c) {
		int p = 1;
		for(int i = 1; i<=c;i++) {
			p = p*n;
		}
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =150; i<=1500; i++ ) {
			int n = i, a = n, sum = 0 , temp = n, c = 0;
			
			while( a>0 ) {
				c++;
				a = a/10;
			}
			while( n>0 ) {
				int r = n%10;
				sum = sum + prod(r,c);
				n = n/10;
			}
			if(temp==sum) {
				System.out.println(sum + " is amstrong");
			}
		}			
		
	}

}
