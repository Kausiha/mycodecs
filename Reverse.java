package sumOfTwoNumbers;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = s.next();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.print(sb);
	}

}
