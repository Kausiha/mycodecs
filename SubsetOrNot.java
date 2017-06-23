import java.util.Scanner;

public class SubsetOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int[] a1 = new int[n1];
		int[] a2 = new int[n2];
		int i, n = 0;
		for (i = 0; i < n1; i++) {
			a1[i] = s.nextInt();
		}
		for (i = 0; i < n2; i++) {
			a2[i] = s.nextInt();
		}
		if ((n2 > n1) || (n1 == n2)) {
			for (i = 0; i < n1; i++) {
				for (int j = 0; j < n2; j++) {
					if (a1[i] == a2[j]) {
						n++;
						break;
					}
				}

			}
		} else
			System.out
					.println("Enter array 1 either less than or same size of array2..");
		if (n == n1) {
			System.out.print("Array 1 is a Subset of Array 2");
		} else
			System.out.print("Array 1 is not a Subset of Array 2");
	}
}
