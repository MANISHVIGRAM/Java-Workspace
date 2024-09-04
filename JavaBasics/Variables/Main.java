package Variables;

public class Main {

	public static void main(String[] args) {
		int x = 88;
		double y = 3.14;
		String name = "MANISH";
		System.out.println(x);
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		if(s1.equals(s2)) {
			System.out.println("EQUAL");
		}
		else {
			System.out.println("Not Equal");
		}
		int a[]= {1,2,3};
		int b[]= a;
		b[0]=0;
		b[1]=9;
		System.out.println(b[1]+" "+a[1]);
		int n=1;
		while(n<=5) {
		System.out.println(n);
		n++;
		}
		int numb=8;
		int ans = numb;
		numb--;
		System.out.println(ans);
	}

}
