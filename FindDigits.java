import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	      
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	           
	          int p=0;
	          int k=0;
   		   
	            		while(n>0) {
	            			 p = n%10;
	            		 // System.out.println("remi :"+p);
	            		    if(p!=0&&n%p==0)
		            		    {//System.out.println(n/p);
		            		    	k++;
		            		    	//System.out.println(k);
		            		    }      		    
	            		    n =n/ 10;
	            		    
	            		}
	            		System.out.println(k);
	            		}
	            		
	            	
	            		
	        }
	        
	        
	        
	        
	}

