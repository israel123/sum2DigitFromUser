
import java.util.Scanner;

public class sum2Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("please enter number to num: ");
		num = sc.nextInt();
		
		int ones, tens;
		
		ones = num % 10;
		tens = num / 10;
		
		int sumDigits = ones + tens;
		
		System.out.println("The sum of digits of " + num + " is:" + sumDigits);
	}

}
