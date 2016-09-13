import java.util.Scanner;

public class GameofThrones1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		int odd = 0, even = 0;
		int[] arr = new int[26];
		for (int i = 0; i < a.length(); i++) {
			arr[a.charAt(i) - 'a']++;

		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] % 2 == 0) {

				even++;
			} else
				odd++;

		}
		if (odd > 1)
			System.out.println("NO");
		else
			System.out.println("YES");

		// TODO Auto-generated method stub

	}

}
