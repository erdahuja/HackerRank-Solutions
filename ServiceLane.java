import java.util.*;

public class ServiceLane {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int min=3;
        int index=0;
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            
            for(int k=i;k<=j;k++){
            	if(width[k]<min){
            		min=width[k];
            		index=k;
            		
            	}           	
          
            	
            }
            System.out.println(min);
          	if(min==1)
        		System.out.println("1");
        	else if(min==2)
        		System.out.println("2");
        	else if(min==3)
        		System.out.println("3");       
            min=3;
            
        }
    }
}