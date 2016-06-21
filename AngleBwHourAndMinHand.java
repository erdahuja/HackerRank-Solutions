import java.util.Scanner;

public class AngleBwHourAndMinHand {

	public static void main(String[] args) {
		
		int t,h,m;
		Scanner scanner = new Scanner(System.in);
		t=scanner.nextInt();
		float angle;
		while(t-->0){
			
			h=scanner.nextInt();
			m=scanner.nextInt();
			int t1;
			
			h=h*30;
			m=m*6;
			t1=h-m;
			if(t1==360)
				t1=0;
			else if(t1>180)
				t1=360-t1;
			System.out.println(Math.abs(t1));
			
			
			
			
			
			
		}
	}

}
