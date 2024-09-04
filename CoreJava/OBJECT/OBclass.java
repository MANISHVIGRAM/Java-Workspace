package OBJECT;
// OBJECT class is a root class present in java.ang.package
//There is no data members 
//In java all the classes are sub class of object class and object class is internally inherited to all the sub classes.

public class OBclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
		String s = o1.toString();
		System.out.println(s); //Prints fully qualified class name and EXPLICIT PRINTING
		int n = o1.hashCode(); //Gives the ADDRESS of the class.
		System.out.println(n); // Prints the address of the class
		boolean result = o1.equals(o1);//Compares the value
		System.out.println(result); 
		Object o2 = new Object();
		String s1 = o2.toString();
		System.out.println(s1);
		int n1 = o2.hashCode();
		System.out.println(n1);
		result = o1.equals(o1);
		System.out.println(result);
	}

}
