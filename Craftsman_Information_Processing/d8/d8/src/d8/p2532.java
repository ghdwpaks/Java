package d8;

public class p2532 {

	public static void main(String[] args) {
		int a = 3, b = 4, c= 5,d = 5;
		a += 6 + --b;
		//a = 12 , b = 3
		d *= 7 - c++;
		//d = 20 , c = 6
		System.out.printf("%d, %d, %d, %d\n",a,b,c,d);

	}

}
