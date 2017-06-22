import java.util.Scanner;

public class ReverseDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Value:");
		int num = s.nextInt();
		int temp = 0, q = 0;
		while (num > 0) {
			q = num / 10;
			temp = (temp * 10) + (num % 10);
			num = q;
		}
		System.out.println("The Reverse of Value is: " + temp);

	}

}
