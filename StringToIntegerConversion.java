import java.util.Scanner;

public class StringToIntegerConversion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a String:");
		String str = s.next();
		int val = 0, s1 = 1;
		for (int i = 0; i < str.length(); i++) {
			val = str.charAt(i);
			System.out.format("%d ", val);
		}
		System.out.println("is the Integer for the String " + str);
	}
}
