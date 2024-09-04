class Monitor
{
	int size = 21;
	void display() {
		System.out.println("Monitor is used to DISPLAY!!!!");
	}
}
class KeyBoard
{
	int k=104;
	void Typing()
	{
		System.out.println("Keyborad is used to TYPE!!!!");
	}
}
class Computer
{
	static Monitor m = new Monitor();
	KeyBoard kB = new KeyBoard();
}

public class All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		System.out.println("Monitor is used to DISPLAY!!!!");
		Computer.m.display();
		System.out.println();
		System.out.println("*********************************");
		System.out.println("No of keys="+c.kB.k);
		c.kB.Typing();
		
		
	}

}
