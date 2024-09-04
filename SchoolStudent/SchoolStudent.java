
public class SchoolStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO "+Details.school);

		Details d1 = new Details("MANISH VIGRAM",60,85000.0,93,90,85,99,100);
		d1.display();
		System.out.println("TOTAL = "+ d1.total());
		System.out.println("AVERAGE = "+d1.avg());
		System.out.println("RESULT = "+ d1.PassOrFail());
		
	}
}
