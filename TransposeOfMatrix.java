import java.util.Scanner;

class TransposeOfMatrix {
    public static void main(String args[] ) throws Exception {
        
         // Read input from stdin and provide input before running

        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int M= in.nextInt();
       int[][] a=new int[N][M]; 
       int[][] b=new int[M][N]; 
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
            	a[i][j]=in.nextInt();
           
        }
        }
        
         for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
            	b[j][i]=a[i][j];
           
        }
        }
        
           for (int i = 0; i < M; i++) {
             for (int j = 0; j < N; j++) {
             	System.out.print(b[i][j]+" ");
         }
             System.out.println();
               
    }
          
    }
    }

