import java.util.Scanner;

public class SumCloseToZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int min = Math.abs(0 - (a[0] + a[1])), sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(0 - (a[i] + a[j])) < min) {
					min = Math.abs(0 - (a[i] + a[j]));
					sum = a[i] + a[j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(a[i] + a[j]) == min) {
					System.out.format("%d %d\n", a[i], a[j]);
				}
			}
		}
	}

}
