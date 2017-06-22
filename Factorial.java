package sumOfTwoNumbers;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = s.nextInt();
		int f = 1;
		for (int i = num; i > 0; i--) {
			f *= i;
		}
		System.out.println("The factorial of the Number is: " + f);
	}

}
