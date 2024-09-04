package Emp;
//JAVA BEANS:
//It is class with private data members,public default constructors,public getters and setters and no other methods.
//It is used to transfer data from one to another program.Hence it is called DATA TRANSFER OBJECTS.
class employee{
	private int id;
	private String name;
	private double sal;
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setsal(double sal)
	{
		this.sal=sal;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public double getsal()
	{
		return sal;
	}
}

public class Emply {
	public static void main (String[]args)
	{
		employee emp = new employee();
		emp.setid(1);
		emp.setname("Manish");
		emp.setsal(100000.0);
		System.out.println(emp.getid());
		System.out.println(emp.getname());
		System.out.println(emp.getsal());
	}

}
