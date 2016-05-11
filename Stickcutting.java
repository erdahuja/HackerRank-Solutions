import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stickcutting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }        
        int min=1000;
            
        for(int z=0;z<n;z++)
        {
      
        
        
        
        	 for(int k=0;k<n;k++){
        		 if(arr[k]!=0){
                 if(arr[k]<min){
                     if(arr[k]==0)
                         { }
                     else
                     min=arr[k];
                 }
        		 }
             }
             
          // System.out.println("min : "+min);
        	
        	
        for(int arr_i=0; arr_i < n; arr_i++){
        	if(arr[arr_i]>0){
            arr[arr_i]=arr[arr_i]-min; 
        	count++;  }
        }
       /* for(int arr_i=0; arr_i < n; arr_i++){
         System.out.print(arr[arr_i]+"\t");    
        }*/
        if(min!=1000)
        System.out.println(count);
        count=0;
        min=1000;
        
       
    }
        
        
        
        
        
        
        
        
        
        
    }
}
