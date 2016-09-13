package sortingHackerrank;

import java.util.Scanner;

public class DemoChallenge {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int[] arr=new int[k];
		for(int i=0;i<k;i++){
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<k;i++){
			if(arr[i]==n){
				System.out.println(i);
				break;
			}
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
