import java.util.Scanner;

public class SherlockandSquares {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int t,a,b;
		t=in.nextInt();
		while(t-->0){
			a=in.nextInt();
			b=in.nextInt();
			int count=0,k;
			for(int i=a;i<=b;i++){
				//System.out.println("a :"+i+"a/2 :"+a/2);
				for( k=2;k<=i/2;k++){
				//	System.out.println("k :"+k);
					if(i==k*k){
						count++;
					}
					
				}
				
						
			}
			System.out.println(count);
			
			
			
		}
	

	}

}
