package AnonymousClass;


interface Anonymous
{
	void show();
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous a1 = new Anonymous()
		{
			public void show()
			{
				System.out.println("In Anonymous Show");			
			}
		};
		a1.show();
		System.out.println("USING LAMBDA");
		Anonymous a2 = ()->
		{
			System.out.println("In Anonymous class UISING LAMBDA EXPRESSION");
		};
		a2.show();
		
	}

}
