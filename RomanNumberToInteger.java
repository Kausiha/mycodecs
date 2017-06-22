import java.util.Scanner;

public class RomanNumberToInteger {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String row = s.next().toUpperCase();
		int len = row.length();
		int res = 0, last = 0;
		for (int i = len - 1; i >= 0; i--) {
			if ((row.charAt(i) == 'I') && ((last == 0) || (last == 1))) {
				res = res + 1;
				last = 1;
			}
			if ((row.charAt(i) == 'V')) {
				res += 5;
				last = 5;
			}
			if ((row.charAt(i) == 'I') && (last != 0) && (last != 1)) {
				res -= 1;
				last = 1;
			}
			if ((row.charAt(i) == 'X') && (last <= 10)) {
				res = res + 10;
				last = 10;
			}
			if ((row.charAt(i) == 'X') && (last > 10)) {
				res = res - 10;
				last = 10;
			}
			if ((row.charAt(i) == 'L') && (last <= 50)) {
				res = res + 50;
				last = 50;
			}
			if ((row.charAt(i) == 'L') && (last > 50)) {
				res = res - 50;
				last = 50;
			}
			if ((row.charAt(i) == 'D')) {
				res = res + 500;
				last = 500;
			}
			if ((row.charAt(i) == 'D') && (last > 500)) {
				res = res - 500;
				last = 500;
			}
			if ((row.charAt(i) == 'M')) {
				res = res + 1000;
				last = 1000;
			}
			if ((row.charAt(i) == 'M') && (last > 1000)) {
				res = res - 1000;
				last = 1000;
			}
			if ((row.charAt(i) == 'C')) {
				res = res + 100;
				last = 100;
			}
			if ((row.charAt(i) == 'C') && (last > 100)) {
				res = res - 100;
				last = 100;
			}
		}
		System.out.println(+res);
	}

}
