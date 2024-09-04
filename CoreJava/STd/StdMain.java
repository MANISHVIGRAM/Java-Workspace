package STd;
import java.util.*;
class Student
{
	int rollno;
	String name;
	double mark;
	public Student(int rollno, String name, double mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [ROLL NO = " + rollno + ", NAME = " + name + ", MARK = " + mark + "]";
	}
	
	
}
public class StdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Manish",100);
		Student s2 = new Student(2,"Anish",99);
		Student s3 = new Student(3,"Mani",98);

		Student student[]=new Student[3];
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		
		for(Student std:student)
		{
			System.out.println(std.name +" : "+std.rollno);
		}
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter number of objects: ");
		int objects = sc1.nextInt();
		
		Student students[] = new Student[objects];
		
		for(int i=0;i<=objects-1;i++)
		{
			System.out.println("Enter your RollNo: ");
			int rollno = sc1.nextInt();
			
			System.out.println("Enter your mark : ");
			double mark = sc1.nextDouble();
			
			sc1.nextLine();
			
			System.out.println("Enter your name: ");
			String name = sc1.nextLine();
			
			students[i]=new Student(rollno,name,mark);
		}
		
		for(Student std1 : students)
		{
			System.out.println("ROLL NO: "+std1.rollno);
			System.out.println("NAME: "+std1.name);
			System.out.println("MARK: "+std1.mark);
			System.out.println("* * * * * * * * ");
		}
	}
}
