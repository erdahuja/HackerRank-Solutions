package sortingHackerrank;

import java.util.Scanner;

public class QuickSort {

	static void partition(int[] ar) {
		int p = ar[0];
		int equals[] = new int[ar.length];
		int less[] = new int[ar.length];
		int greater[] = new int[ar.length];
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == p) {
				equals[a++] = ar[i];
				// System.out.println(ar[i]);

			} else if (ar[i] < p) {
				less[b++] = ar[i];
				// System.out.println(ar[i]);

			} else if (ar[i] > p) {
				greater[c++] = ar[i];
				// System.out.println(ar[i]);

			}

		}

		printArray(less, b);
		// System.out.println(b);
		printArray(equals, a);
		printArray(greater, c);

	}

	static void printArray(int[] ar, int b) {
		// System.out.println(b);
		for (int i = 0; i < b; i++) {

			System.out.print(ar[i] + " ");
		}
		// System.out.println();

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
	}
}
