package sortingHackerrank;

import java.util.*;

public class InsertionSortPart2 {

	public static void insertionSortPart2(int[] ar) {
		int k;
		for (int i = 1; i < ar.length; i++) {
			k = i;

			while (k > 0&&ar[k] < ar[k - 1] ) {

				int temp;
				temp = ar[k];
				ar[k] = ar[k - 1];
				ar[k - 1] = temp;
				k--;

			}
			printArray(ar);

		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
