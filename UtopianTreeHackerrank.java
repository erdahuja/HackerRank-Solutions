import java.util.Scanner;

public class UtopianTreeHackerrank {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int h=1;
	            if(n==0)
	            System.out.println(h);
	            else
	            {  
	            	while(n>0){
	            		
	            		h=h*2;
	            		if(--n==0)break;
	            		h=h+1;
	            		if(--n==0)break;
	            		
	            	}
	            	
	              System.out.println(h);
	            
	            }
	            
	            
	            
	            
	        }

	}

}
