import java.util.Scanner;

public class CavityMap {
	public static void main(String[] args) {
		
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	     
	     char map[][]=new char[100][100];
	     
	     for(int i=0;i<n;i++){
	    	
					  map[i]=  in.next().toCharArray();		  
				  			
	     }
				  
	     
	  for(int i=0;i<n;i++){
		  for(int j=0;j<n;j++){
			  if(i==0||j==0||i==n-1||j==n-1){
				  System.out.println(map[i][j]);			  
			  }
			  
		  
	       else if(map[i][j] > map[i][j-1] && map[i][j] > map[i][j+1] && map[i][j] >map[i-1][j] && map[i][j] > map[i+1][j]){
	    	   System.out.print("X");
	       }
	    	   else 
	    		   System.out.print(map[i][j]);
	       
	    	   }System.out.println();
			  
			  
			  
		  }
	  in.close();
	  }
	     
	     
}

