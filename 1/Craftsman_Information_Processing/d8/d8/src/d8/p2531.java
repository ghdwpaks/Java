package d8;

public class p2531 {

	public static void main(String[] args) {
		String str = "Information!";
		int n = str.length();
		char[] st = new char[n];
		n--;
		for (int k = n; k >= 0; k--) {
			st[n - k] = str.charAt(k);
		}
		for (char c:st) {
			System.out.printf("%c",c);
		}
	}

}
