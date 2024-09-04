package Singleton;


//SINGLETON:
//It is a design pattern which allows to create only one object of a class
//It can be achieved by following methods
	// defining the constructor as private
	// creATE A single object within the cls
	// create a static method which returns the same ref.
class calculator
{
	private calculator() {
		System.out.println("OBJECT CREATED!!!!!!!!!");
	}
	static calculator calci = new calculator();
	 static calculator getcalci()
	{
		return calci;
	}
}
	
public class MainSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator.getcalci();

	}

}
