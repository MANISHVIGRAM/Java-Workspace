package StringMethods;

public class Main {

	public static void main(String[] args) {
		String  name = "Manish             ";
		//boolean result = name.equals("Manish");
		//boolean result = name.equalsIgnoreCase("manish");
		//int result = name.indexOf("s");
		//int result = name.length();
		//char result = name.charAt(5);
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		//String result = name.trim();
		String result = name.replace("n","N");
		System.out.println(result);
	}

}
