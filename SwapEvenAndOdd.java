import java.util.Scanner;

public class SwapEvenAndOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c, d;
		String str = s.next();
		char[] chra = str.toCharArray();
		if (str.length() % 2 == 0) {
			for (int i = 0; i < str.length(); i++) {
				if (i % 2 == 0) {
					c = chra[i];
					chra[i] = chra[i + 1];
					chra[i + 1] = c;
				}
			}
		} else {
			for (int i = 0; i < str.length() - 1; i++) {
				if (i % 2 == 0) {
					c = chra[i];
					chra[i] = chra[i + 1];
					chra[i + 1] = c;
				}

			}
		}
		System.out.print(chra);
	}
}
