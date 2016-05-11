import java.util.ArrayList;
import java.util.Scanner;

public class LisasWorkbook {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        int x,y;
	        x=s.nextInt();
	        int[] z=new int[x];
	        y=s.nextInt();
	       int pages=0,ans=0;
	        for(int i=0;i<x;i++){
	        	z[i]=s.nextInt(); 
	        	for(int j=1;j<=z[i];j++)
	        		{
	        	if(j==pages)
	        		ans++;
	        	if(j%y==0)
        			pages++;
	        		}
	        	if(z[i]%y!=0)
	        		pages++;
	        	 
	        }
	        
	        
	        
	    
	     System.out.println(ans); 
	      
	        
	        
		// TODO Auto-generated method stub

	}

}
