package Inheri;

interface Computer
{
	void code();
}

class laptop implements Computer
{
	public void code()
	{
		System.out.println("You are provided with a LAPTOP!!!");
	}
}

class desktop implements Computer
{
	public void code()
	{
		System.out.println("You are provided with a DESKTOP!!");
	}
}

class Developer
{
	public void devApp(Computer com)
	{
		com.code();
	}
}
public class hyredical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer lap = new laptop();
		Computer desk = new desktop();
		
		Developer dev = new Developer();
		dev.devApp(lap);
		dev.devApp(desk);
	}

}
