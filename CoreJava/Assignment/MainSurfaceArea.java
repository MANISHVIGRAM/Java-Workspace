package AssignmentKarthi;


class surfaceArea
{
	final static double pi = 3.14;
	public double area(double r)
	{
		return 4*pi*r*r;
	}
	public static double area(double r, double h)
	{
		return 2*pi*r*(h+r);
	}
}

public class MainSurfaceArea extends surfaceArea{

	public static void main(String[] args) {
		surfaceArea obj1 = new MainSurfaceArea();
		MainSurfaceArea obj2 = (MainSurfaceArea)obj1;
		obj2.Display();
	}
	
	public void Display()
	{
		System.out.println("Surface Area of SPHERE : "+ area(8));
		System.out.println("Surface Area of CYLINDER : "+area(8,8));
	}	
}
