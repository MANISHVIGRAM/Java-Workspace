
class Tyre
{
	int t = 2;
	void Rotate()
	{
		System.out.println("Tyre is used to move the bike!!!!");
	}
}
class Machine
{
	int e = 1;
	void Engine()
	{
		System.out.println("Engine is the heart of a bike!!!!");
	}
}
class Vehicle
{
	Tyre t = new Tyre();
	static Machine m = new Machine();
}
public class Bike {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		System.out.println("No of tyres="+v.t.t);
		v.t.Rotate();
		System.out.println();
		System.out.println("*****************************************");
		System.out.println();
		System.out.println("No of engine="+Vehicle.m.e);
		Vehicle.m.Engine();
	}

}
