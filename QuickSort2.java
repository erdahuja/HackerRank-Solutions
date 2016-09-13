package sortingHackerrank;

import java.util.*;

public class QuickSort2 {

	static void quickSort(int[] ar, int first, int last) {
		//System.out.println("in qs");
		int pivot;
		
		

		pivot = ar[first];
		int j = last + 1;
		int i = first - 1;
		if(first>=last){
			return ;
		}
		while (i < j) {
			i++;
			while (ar[i] < pivot) {
				i++;
			}
			j--;
			while (ar[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(ar, i, j);
			}
			//System.out.println("in while");
		}
		//System.out.println("outside while");
		//printArray());
		quickSort(ar, first, j);
		quickSort(ar, j + 1, last);

	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void printArray(int[] ar,int i ,int j) {
		//System.out.println("printing");
		for (int k=i;k<j;k++) {
			System.out.print(ar[k] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar, 0, ar.length - 1);
		// printArray(ar);
	}
}
