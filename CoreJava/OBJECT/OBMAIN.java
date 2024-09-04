package OBJECT;

import java.util.Objects;

class Student
{
	int id;
	String name;
	double mark;
	Student(int id, String name, double mark)
	{
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public String toString() {
		return "[sid=" + id + ", sname=" + name + ", smark=" + mark + "]";
	}
	public int hashCode() {
		return id;
	}
	public boolean equals(Object obj) {
		if (this.hashCode() == obj.hashCode())
			return true;
		else 
			return false;
	}	
}

public class OBMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Manish",99.0);
		Student s2 = new Student(2,"Vigram",98.0);
		Student s3 = new Student(1,"Manish",97.0);
		String s = s1.toString();
		System.out.println(s);
		System.out.println(s1.toString());
		int n = s1.hashCode();
		System.out.println(n);
		System.out.println(s2.hashCode());
		boolean res = s1.equals(s2);
		System.out.println(res);
		System.out.println(s1.equals(s3));
		
	}

}
