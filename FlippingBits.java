import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		
		int t;
		Scanner scan=new Scanner(System.in);
		t=scan.nextInt();
		scan.nextLine();
		int c;
		String s,k;
		String binary;
		char p = 0;
		while(t-->0){
		s=scan.nextLine();
		c=Integer.parseInt(s);
		binary=Integer.toString(c, 2);
		for(int i=0;i<binary.length();i++){
			if(binary.toCharArray()[i]==1){
				p=binary.toCharArray()[i]=0;
				
			}
			else
				p=binary.toCharArray()[i]=1;
		}
		
		
		
		for(int i=0;i<binary.length();i++){
	System.out.println(p);
	}
		
		/*	k=p.toString();
			System.out.println(k);
			int d=Integer.parseInt(k,2)	;	
			System.out.println(d);
			*/
			
		}
		

	}

}
