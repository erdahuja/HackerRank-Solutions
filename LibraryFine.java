import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		
		  Scanner in = new Scanner(System.in);
	        int d1 = in.nextInt();
	        int m1 = in.nextInt();
	        int y1 = in.nextInt();
	        int d2 = in.nextInt();
	        int m2 = in.nextInt();
	        int y2 = in.nextInt();
	        int fine=0;
	        if(y1==y2){
	        	System.out.println("same year");
	        	if(m1==m2){
	        		System.out.println("same month");
	        		if(d1>d2)
	        		fine=15*(d1-d2);
	        		
	        	}
	        	else if(m1>m2)
	        	{
	        		System.out.println("diff month");
	        		fine=500*(m1-m2);
	        	}
	        	
	        }
	        else if(y1>y2)
	        	{
	        	System.out.println("diff year");
	        	fine=10000;
	}
	        if(d1<d2&&m1<m2&&y1<y2)
	        	fine=0;
	        
	        System.out.println(fine);
	        
	}

}
