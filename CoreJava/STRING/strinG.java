package STRING;

public class strinG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String();
		String s2 = new String("abc");
		char [] arr = {'a','b','c'};
		String s3 = new String (arr);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.equals(s3));
	}

}
