package STRING;

public class ReverseAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Madam".trim().toLowerCase();
		String s2 = "";
		for (int i = s1.length()-1;i>=0;i--)
		{
			s2 = s2+s1.charAt(i);
			
		}
		s2=s2.trim();
		
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not plindrome");
		}
		
		char [] ch = s1.toCharArray();
		for(int i = ch.length-1; i>=0;i-- ) {
			System.out.print(ch[i]);
		}
		
	}

}
