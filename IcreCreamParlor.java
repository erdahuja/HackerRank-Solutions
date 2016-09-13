import java.util.Scanner;

public class IcreCreamParlor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n, m;
			m = scanner.nextInt();
			n = scanner.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = scanner.nextInt();
			}
			for (int k = 0; k < a.length; k++) {
				for (int i = 0; i < a.length; i++) {
					if (k != i) {
						if (a[k] + a[i] == m) {
							int p = i + 1;
							System.out.println(k + 1 + " " + p);
						}
					}

				}
			}

		}

	}

}
