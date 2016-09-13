import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String string;
		 int flag=0;
		string=s.nextLine();
		char[] stringchar=string.replaceAll(" ","").toCharArray();
	 int a[] =new int[26];
	 int k=97;
	 for(int j=0;j<26;j++){
		a[j]=k;
		k++;
		 }
	 int[] c=new int[26];
	 int k2=65;
	 for(int j=0;j<26;j++){
		c[j]=k2;
		k2++;
		 }
	 
	 int b[] =new int[26];
	//System.out.println("String length"+stringchar.length);
	 for(int i=0;i<stringchar.length;i++){
		
		 for(int j=0;j<26;j++){
			// System.out.println(stringchar[i]);
		 if(stringchar[i]==(char)a[j]||stringchar[i]==(char)c[j]){
			// System.out.println(a[j]+" "+(char)a[j]+" "+j);
			 b[j]++;
		 }
		
		 }
	 }
	 
	
	 for(int i1=0;i1<26;i1++){
		 if(b[i1]==0){
			 flag++;
			break; 
			 
		 }
	 
		 
	 }
	 
	 
		
	 
	 if(flag==0){
		 System.out.println("pangram");
		
		 
	 }
	 else{
		 System.out.println("not pangram");
	 }
		
		
		


	}
	}
