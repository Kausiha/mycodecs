import java.util.Scanner;

public class FindRepeatedWithTime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int j, i;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					System.out.format("%d ", a[i]);
				}
			}
		}
	}
}
