package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		int c=0;
		try {
			c=a/b;
			System.out.println("ADD = "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid operation "+e);
		}
		catch(Exception e) {
			System.out.println("Error Occurred:"+e);
		}
		finally {
			System.out.println("Compiled successfully");
		}
		System.out.println("End of program");
		System.out.println("this is one part of a exception handling");
	}
}
