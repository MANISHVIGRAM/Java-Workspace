package COLLECTIONS;

import java.util.HashMap;
import java.util.Map;

class Employee
{
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
}

public class exeClass {

	public static void main(String[] args) {
		Map<Integer,Employee> emp = new HashMap<>();
		emp.put(1,new Employee(1,"Manish",100000.0));
		emp.put(2,new Employee(2,"Vigram",200000.0));
		emp.put(3,new Employee(3,"Sankar",300000.0));
		emp.get(1).sal=3000000.0;
		emp.get(2).sal=3000000.0;
		emp.get(3).sal=3000000.0;
		System.out.println(emp.get(1).name);
		System.out.println(emp.get(2).name);
	}

}
