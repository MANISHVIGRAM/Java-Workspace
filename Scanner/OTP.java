package scanner;
import java.util.*;
public class OTP {
	static String GenerateOTP()
	{
		String otp=" ";
		otp = otp + (int)(Math.random()*10)
				+(int)(Math.random()*10)
				+(int)(Math.random()*10)+
				(int)(Math.random()*10);
		return otp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		System.out.println(r1.nextInt());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextFloat());
		for (int i =1; i<=100;i++) {
			System.out.println(GenerateOTP());
		}

	}

}
