import java.util.Scanner;

public class FindValuesEqualToIndexInArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = 1, flag = 0;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				System.out.print("Enter Sorted Array");
				flag = -1;
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {

					c++;

				}
			}
			if (c > 1) {
				System.out.print("Enter Unique Elements..");
				flag = -1;
				break;
			}
			c = 1;

		}
		if (flag != -1) {
			Find f = new Find();
			f.findValue(a);
		}

	}
}
