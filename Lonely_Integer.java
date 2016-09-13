import java.util.Scanner;

public class Lonely_Integer {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[100];
		int count=0;
		int kp=10^12;
		System.out.println(kp);
		for(int i=0;i<n;i++)
		{
			int k=s.nextInt();
			
	            a[k]++;
	            //System.out.println(a[0]);
	       /* } else if(k==1) {
	             a[1]++;
	            // System.out.println(a[1]);
	        } else if(k == 2) {
	             a[2]++;
	        } else if(k == 3) {
	             a[3]++;
	        } else if(k == 4) {
	             a[4]++;
	        }
	        else if(k == 5) {
	             a[5]++;
	        } else if(k == 6) {
	             a[6]++;
	        } else if(k == 7) {
	             a[7]++;
	        } else if(k == 8) {
	             a[8]++;
	        }else if(k == 9) {
	             a[9]++;
	        } 
			*/
			
		}
		
		
		
		for(int i=0;i<10;i++){
			//System.out.println("in loop");
			//System.out.print(a[i]);
			if(a[i]==1){
				System.out.println(i);
				//count++;
			}
		}
		//System.out.println(count);
		
		
		
	}

}
