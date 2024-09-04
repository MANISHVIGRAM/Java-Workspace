package ControlStatements;

public class IfElseByMETHOD {
	static void OddorEven(int num)
	{
		if(num%2==0) {
			System.out.println(num +" is EVEN");
		}
		else {
			System.out.println(num +" is ODD");
		}
	}
	public static void main(String[] args) {
		OddorEven(44);
		OddorEven(33);
	}

}
