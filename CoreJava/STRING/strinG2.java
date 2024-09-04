package STRING;

public class strinG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "java";
		String s3 = new String ("java");
		String s4 = new String ("java");
		System.out.println("s1. "+s1);
		System.out.println("s2. "+s3);
		System.out.println("s3. "+s3);
		System.out.println("s4. "+s4);
		System.out.println(s1==s2);  // == operator check the address
		System.out.println(s1==s3);
		System.out.println(s1.equals(s4)); // equals() compares the value.
		System.out.println(s3.equals(s4));
	}

}
