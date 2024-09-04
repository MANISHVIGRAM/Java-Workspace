package OBJECT;

public class OBclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
		Object o2 = new Object();
		// Explicit call  to toString();
		String s1 = o1.toString();
		System.out.println(s1);
		System.out.println(o1.toString());
		//Implicit call to toString()
		System.out.println(o2);
		System.out.println(new Object());
		int n1 = o1.hashCode();
		System.out.println(n1);
		System.out.println(o1.hashCode());
		boolean res = o1.equals(o2);
		System.out.println(res);
		boolean res1 = o2.equals(o1);
		System.out.println(res1);
		boolean res2 = o1.equals(o1);
		System.out.println(res2);
	}

}
