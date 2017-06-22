import java.util.Scanner;

public class StringToCamelCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] c = str.toCharArray();
		c[0] = Character.toLowerCase(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				c[i + 1] = Character.toUpperCase(str.charAt(i + 1));
			}
		}
		System.out.println(c);
	}

}
