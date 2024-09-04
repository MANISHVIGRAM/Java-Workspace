package WhileLoop;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb = 234567,prod=1;
		while (numb>0) {
			int re =  numb % 10;
			prod = prod * re;
			numb = numb / 10;
		}
		System.out.print("Product of the digits = "+ prod);

	}

}
