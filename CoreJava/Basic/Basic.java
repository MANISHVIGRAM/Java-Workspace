package Basic;
class M
{
	M()
	{
		this(10);
		System.out.println("1");
	}
	M(int x)
	{
		this(10.5);
		System.out.println("2");
	}
	M(double y)
	{
		System.out.println("3");
	}
}

public class Basic {
	static void test () {
		System.out.println("1");
	}
	static void test (int a) {
		System.out.println("2");
	}
	static void test (int a , int b) {
		System.out.println("3");
	}
	static void test (int a,double b) {
		System.out.println("4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MANISH");
		
		System.out.println("*****************");
		
		System.out.println(20+20);
		
		
		System.out.println("*****************");
		
		System.out.println("Number is "+20+20);
		
		System.out.println("*****************");
		
		System.out.println(20+20+" is a number");
		test();
		test(1);
		test(1,2);
		test(1,1.0);
		System.out.println("*****************");
		int qno=25;
		String event = "Java Quiz";
		//System.out.printf("Event : %s, Qno : %d",qno,event);
		System.out.println("+++++++++++++++++++++++++++");
		M m1 = new M();

		
	
		System.out.println("*****************");
	}

}
