package STd;

import java.util.*;

public class StdMain2 {

	public static void main(String[] args) {
		Comparator <Student> stds1 = new Comparator<Student>()
				{

					@Override
					public int compare(Student s1, Student s2) 
					{
						if(s1.rollno > s2.rollno) 
						{
							return 1;
						}
						else
						{
							return -1;
						}
					}
			
				};
				
		Comparator <Student> stds2 = new Comparator<Student>()
				{

					@Override
					public int compare(Student s1, Student s2) 
					{
						if(s1.mark > s2.mark) 
						{
							return 1;
						}
						else
						{
							return -1;
						}
					}
			
				};
		
		ArrayList<Student> Stds = new ArrayList();
		Stds.add(new Student(5,"Manish",90));
		Stds.add(new Student(2,"Showmiya",99));
		Stds.add(new Student(1,"Sankar",89));
		Stds.add(new Student(6,"Dharshini",87));
		Stds.add(new Student(3,"Yuva",89));
		Stds.add(new Student(4,"Harish",66));
		System.out.println(Stds);
		System.out.println("******************************************");
		
		Collections.sort(Stds,stds1);
		
		for(Student s  : Stds)
		{
			System.out.println(s);
		}
		
		System.out.println("******************************************");
		Collections.sort(Stds,stds2);
		for(Student s1  : Stds)
		{
			System.out.println(s1);
		}
		
	}

}
