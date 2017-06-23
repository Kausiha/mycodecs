import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first = s.nextInt();
		int last = s.nextInt();
		int k = 0, count = 0, z = (first + 1) - (last - 1);
		if ((first > 0) && (last > 0)) {
			for (int i = first + 1; i < last; i++) {
				for (int j = 2; j < i / 2; j++) {
					if (i % j == 0) {
						k = -1;
						break;
					}
				}
				if (k == 0)
					count++;
				k = 0;

			}
		} else
			System.out.println("Enter a number greater than 0");
		System.out.println(count);

	}

}
