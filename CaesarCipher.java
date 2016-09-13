import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String s = in.next();
	        int k = in.nextInt();
	        int k1=k%26;
	      //  System.out.println(k1);
	       char[] p=s.toCharArray();
	       for (int i = 0; i < p.length; i++) {

	   	    // Shift letter, moving back or forward 26 places if needed.
	   	    char letter = p[i];
	   	    
	   	    letter = (char) (letter + k1);
	   	    if (letter > 'z') {
	   		letter = (char) (letter - 26);
	   	    } else if (letter < 'a') {
	   		letter = (char) (letter + 26);
	   	    }
	   	    p[i] = letter;
	   	}
	     System.out.println(p);
	        
	        in.close();
		
		
		

	}

}
