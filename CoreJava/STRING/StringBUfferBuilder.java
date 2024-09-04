package STRING;

public class StringBUfferBuilder {
	//STRING BUFFER
	//*It is a final class prsent java.lang package
	//*It is mutable class
	//*It is thread safe 
	//*Only tostring is overrided , hashCode and equals performs based on the address
	//*It is comparable type
	
	
	//STRING BUILDER
	//*//*It is a final class prsent java.lang package
	//*It is mutable class
	//*It is not thread safe 
	//*Only tostring is overrided , hashCode and equals performs based on the address
	//*It is comparable type

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("abd");
		StringBuilder sb2 = new StringBuilder("ABCDEF");
		System.out.println(sb2);
		sb2.append("GHIJKL");
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		
		System.out.println(sb1);
		sb1.append("e vilers");
		System.out.println(sb1);
		
		sb1.insert(2," ");
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		//palindrome using string buffer
		String s1 = "mom";
		StringBuffer sb3 = new StringBuffer(s1);
		sb3.reverse();
		String s2 = sb3.toString();
		if (s1.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}

	}

}
