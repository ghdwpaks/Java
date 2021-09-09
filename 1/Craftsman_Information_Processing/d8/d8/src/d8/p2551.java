package d8;

public class p2551{
	public static int a = 1;
	static void increase() {
		int b= 2;
		System.out.printf("%d, %d\n", ++a,++b);
	}
	public static void main(String[] args) {
		increase();
		increase();
	}

}
