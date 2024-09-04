package WhileLoop;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15,a = 0,b = 1,c; 
		if(n==1) {
			System.out.print(a);
		}
		
		else {
			n = n - 2;
			System.out.print(" "+a);
			System.out.print(" "+b);
			while(n>0) {


				c = a+b;
				n--;
				System.out.print( " " +c );
				a = b;
				b = c;
			}
		}
	}

}
