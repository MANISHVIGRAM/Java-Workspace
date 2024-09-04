package UserInput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("What is ur name?");
		String name = scanner.nextLine();
		
		System.out.println("What is ur age?");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("What are u doing?");
		String work = scanner.nextLine();
		
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("I'm studying "+work);
	}

}
