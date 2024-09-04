package COLLECTIONS;

public class COLLections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer (100);
		Integer i2 = 100;//AUTOBOXING - Converting primitive data type into wrapper class type
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		int a = i2; // AUTO UNBOXING - Converting wrapper class type into primitive data type
		System.out.println(a);
		String s = "2001";
		int b = Integer.parseInt(s); //PARSING - Converting STRING TYPE to primitive data type\
		System.out.println(b);
		String n = "650";
		double d = Double.parseDouble(n);
		System.out.println(d);
	}

}
