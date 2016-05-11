import java.util.Scanner;

public class SherlockAndBeast {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t,n;
		t=in.nextInt();
		while(t-->0)
		{
			n=in.nextInt();
			String s="";
			String s2 = null;
			for(int i=0;i<n;i++){
				s=s.concat(String.valueOf(5));
				if(s.length()%3==0){
					s2=s;
					
				}
				
			}
			System.out.println(s2);
			
		s="";
			
			for(int i=0;i<n;i++){
				s=s.concat(String.valueOf(3));
				if(s.length()%5==0){
					System.out.println(s);
					s="";
				}
			}
			System.out.println(s2);
			
			
			
			
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
