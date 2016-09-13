package sortingHackerrank;

import java.util.Scanner;

public class InsertionSort1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int k = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (k < arr[i]) {
				
				arr[i + 1] = arr[i];
				for (int l = 0; l < n; l++) {
					System.out.print(arr[l]+" ");
				}
				System.out.println();
				if(i==0){
					int temp;
					temp=arr[i];
					arr[i]=k;
					arr[i+1]=temp;
					break;
				}
				
				
			} else {
				
				arr[i+1]=k;
				break;

			}

		}

		for (int l = 0; l < n; l++) {
			System.out.print(arr[l]+" ");
		}

		// TODO Auto-generated method stub

	}

}
