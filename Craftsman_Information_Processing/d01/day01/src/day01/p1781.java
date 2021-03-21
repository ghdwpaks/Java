package day01;

public class p1781 {

	public static void main(String[] args) {
		String str = "Programming";
		int n = str.length();
		//System.out.println(str.charAt(1));
		char[] st = new char [n];
		n--;
		for (int k = n; k >= 0; k--) {
			st[n - k] = str.charAt(k);
			
		}
		for (char k : st) {
			System.out.printf("%c",k);
		}
		

	}

}
