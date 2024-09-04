package TWODarrays;

public class Main {

	public static void main(String[] args) {
		//String [] [] cars = {{"Audi","BMW","Ford"},{"R8","M3","Mustang"}};
		String [] [] cars = new String[2][3];
		cars[0][0] = "Audi";
		cars[0][1] = "Bmw";
		cars[0][2] = "Ford";
		cars[1][0] = "R8";
		cars[1][1] = "M3";
		cars[1][2] = "Mustang";
		for (int i =0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++){
				System.out.print(cars[i][j]+" ");
			}
		}

	}

}
