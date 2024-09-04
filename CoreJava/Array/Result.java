package Array;

import java.util.Arrays;

class Student
{
	int id;
	String name;
	double marks[];
	public Student(int id, String name, double marks[]) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	double total()
	{
		double s=0;
		for(double z:marks)
		{
			s+=z;
		}
		return s;
	}
	double average()
	{
		{
			return total()/ marks.length;
		}
	}
	String result()
	{
		String res = "PASS";
		for (double z : marks)
		{
			if(z<35.0)
			{
				res = "FAIL";
				break;
			}		
		}
		return res;
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(1,"Manish",new double[]{100,99,93,90,85});
		System.out.println(std1);
		System.out.println("TOTAL = "+std1.total());
		System.out.println("AVERAGE = "+std1.average());
		System.out.println("RESULT = "+std1.result());

	}

	

}
