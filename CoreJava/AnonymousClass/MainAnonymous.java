package AnonymousClass;

interface A
{
	void num(int i);
}

@FunctionalInterface
interface B
{
	int add(int x, int y);
	//int sub (int x, int y);
}
public class MainAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = (i)->
		{
			System.out.println(i+" is the number ");
			System.out.println("LAMBDA EXPRESSION");
		};
		a1.num(10);
		//other way
		A a2 = i->
		{
			System.out.println("num is "+(i));
		};
		a2.num(100);
		
		B b1 = (x,y)->
		{
			return x+y;
		};
		System.out.println(b1.add(3,6));
		
		System.out.println("If we have return statement then LAMBDA EXPRESSION will work in FUNNCTIONAL INTERFACE");
		B b2 = (x,y)-> x+y;
		System.out.println(b2.add(10, 20));
	}

}
