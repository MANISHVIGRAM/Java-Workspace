package Constructor;
class A{
	final static String company = "ZOHO";
	String name;
	final int id;
	double sal;
	A(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	A(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void Display()
	{
		System.out.println("EMPLOYEE NAME : "+ name);
		System.out.println("EMPLOYEE ID : "+id);
		System.out.println("EMPLOYEE SALARY : "+sal);
	}
	double as() {
		return 12*sal;
	}
	
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A(1,"Manish",1000);
		a1.Display();
		System.out.println("Annual Salary : "+a1.as());
	}

}
