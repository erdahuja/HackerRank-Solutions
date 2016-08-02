import java.util.Scanner;


public class SidAndSev {

	
	public static void main(String[] args) {
 double  pi= 3.141593 ;
		Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t-->0){
	int a = s.nextInt();
	if(a<20||a>100){
		System.exit(0);
	}
	int h=s.nextInt();
	if(h<0||h>a){System.exit(0);
	}
	double theta_max=s.nextInt();
	if(theta_max<0||theta_max>90){
		System.exit(0);
	}
	
	double th=(theta_max*pi/180);
	
int h1=h-(int) Math.floor(0.5*Math.tan(th)*a);
 

System.out.println(h1);
	
}	

	}

}
