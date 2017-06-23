import java.util.Scanner;

public class Isomorphic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int flag = 0;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				for (int j = i+1; j < str1.length(); j++) {
					if (str1.charAt(i) == str1.charAt(j)) {
						if (str2.charAt(i) == str2.charAt(j)) {
							continue;
						} else {
							flag = -1;
						}

					}
				}

			}
			if (flag == -1)
				System.out.println("False");
			else
				System.out.println("True");
		} else {
			System.out.println("Strings Must Be Of Equal length");
		}
	}
}
