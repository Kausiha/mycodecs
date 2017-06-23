import java.util.Scanner;

public class FirstElementRepeated {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int c = 1, in = 0, d = n;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {
					if (Math.abs(i - j) < d) {
						d = Math.abs(i - j);
						in = i;

					}
				}
			}

		}
		System.out.print(a[in]);
	}
}
