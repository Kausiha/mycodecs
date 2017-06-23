import java.util.Scanner;

public class SumOfIntegers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (a[i] + a[j] == a[k]) {
						System.out.format("%d %d %d\n", i, j, k);
					}
				}
			}
		}
	}

}
