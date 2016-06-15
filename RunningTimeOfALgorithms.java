package sortingHackerrank;

import java.util.*;

public class RunningTimeOfALgorithms {

	public static int insertionSortPart2(int[] ar) {
		int k,mod=0;
		for (int i = 1; i < ar.length; i++) {
			k = i;

			while (k > 0&&ar[k] < ar[k - 1] ) {

				int temp;
				temp = ar[k];
				ar[k] = ar[k - 1];
				ar[k - 1] = temp;
				mod++;
				k--;

			}
			//printArray(ar);

		}
		return mod;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
	int mod=	insertionSortPart2(ar);
System.out.println(mod);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
