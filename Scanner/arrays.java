package scanner;
import java.util.*;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = scanner.nextInt();
		String name[]=new String[size];
		for (int i =0;i<name.length;i++) {
			System.out.println("Enter the number "+(i+1)+":");
			name[i]=scanner.next();
		}
		System.out.println(Arrays.toString(name));
	}

}
