package STRING;

public class stringMETHODS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java Developer";
		String s2 = "Java";
		String s3 = "java";
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.endsWith("e"));
		System.out.println(s2.replace("a","A"));
		System.out.println(s1.trim());
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.compareToIgnoreCase(s1));
		//System.out.println(s3.split(s3));

	}

}
