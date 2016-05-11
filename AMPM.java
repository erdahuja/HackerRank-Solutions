

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AMPM {

	

	public static void main(String[] args) throws ParseException {
		
	String time;
		Scanner s=new Scanner(System.in);
		time=s.next();
	
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
	       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
	       java.util.Date date = parseFormat.parse(time);
	       System.out.println(displayFormat.format(date));		        
		        
		 


	}

}
