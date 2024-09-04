package Array;

import java.util.*;

class Student1
{
	int id;
	String name;
	double marks[];
	public Student1(int id, String name, double[] marks) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	double total()
	{
		double sum=0;
		for (double mark:marks)
		{
			sum = sum+mark;
		}
		return sum;
	}
	double average()
	{
		return total()/ marks.length;
	}
	String result()
	{
		String res = "PASS";
		for(double z : marks)
		{
			if(z<35)
			{
				res = "FAIL";
				break;
			}
		}
		return res;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name +  "]";
	}
	
}
public class Result1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		double marks [] = new double[5];
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter mark: "+(i+1));
			marks[i]=sc.nextDouble();
		}
		Student1 std1 = new Student1(id,name,marks);
		System.out.println(std1.toString());
		System.out.println("MARK = "+Arrays.toString(std1.marks));
		System.out.println("TOTAL = "+std1.total());
		System.out.println("AVERAGE = "+std1.average());
		System.out.println("RESULT = "+std1.result());

	}

}
