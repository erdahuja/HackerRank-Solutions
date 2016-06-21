import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {

		int t;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		while (t-- > 0) {

			int sumr = 0;
			int suml = 0;
			int flag = 0;
			int k = 0, p = 0;
			int size = scanner.nextInt();
			if (size == 1) {
				int c = scanner.nextInt();
				System.out.println("YES");
				continue;
			}
			int a[] = new int[size];
			int temp = 0;

			for (int i = 0; i < size; i++) {
				a[i] = scanner.nextInt();

			}

			for (int i = 0; i < size; i++) {
				temp = a[i];

				if (i == 0) {
					suml = 0;
					System.out.println("sum l :" + suml);

				} else if (k == 0)

				{
					for (int j = 0; j <= i - 1; j++) {
						suml += a[j];

					}
					k++;
					System.out.println("sum l :" + suml);
				} else {
					suml += a[i - 1];

				}

				if (i == size) {
					sumr = 0;
					System.out.println("Sumr :" + sumr);
				}

				else if (p == 0) {

					for (int j = i + 1; j < size; j++) {
						sumr += a[j];
					}
					p++;
					System.out.println("Sumr :" + sumr);
				} else if (i < size) {

					sumr -= a[i];
				}

				if (suml == sumr) {

					flag = 1;
					break;
				} else
					flag = 0;

			}

			if (flag == 1) {
				System.out.println("YES");

			} else if (flag == 0) {
				System.out.println("NO");
			}

		}

		// TODO Auto-generated method stub

	}

}
