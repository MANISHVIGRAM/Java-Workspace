package LogicalOperators;

import java.util.Scanner;
public class Not {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("you are playing a game,Press 'q' or 'Q' to quite");
		String response = scanner.nextLine();
		if(response.equals("q")|| response.equals("Q")) {
			System.out.println("you quite the game");
		}
		else {
			System.out.println("you are still playing");
		}

	}

}
