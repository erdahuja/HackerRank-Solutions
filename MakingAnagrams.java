import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		int count = 0;
		int[] a1 = new int[26];

		
		for (int i = 0; i < a.length(); i++) {
			a1[a.charAt(i) - 'a']++;
		}
		for (int i = 0; i < b.length(); i++) {
			a1[b.charAt(i) - 'a']--;
		}

		for (int i = 0; i < a1.length; i++) {
			
				count = count + Math.abs(a1[i]);
		}
		System.out.println(count);

	}

}
