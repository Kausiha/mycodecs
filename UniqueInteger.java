import java.util.ArrayList;
import java.util.Scanner;

public class UniqueInteger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int c = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {
					c++;
				}
			}
			if (c == 1) {
				System.out.print(a[i]);
				break;
			} else if (c > 2) {
				System.out
						.print("The Elements Can Occur only to Maximum of Two times");
				break;
			}
			c = 1;
		}
	}
}
