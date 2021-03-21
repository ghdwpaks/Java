package day01;

public class p1751 {

	static class AAclass{
		int i;
		int j;
	}
	
	public static void main(String[] args) {
		AAclass m = new AAclass();
		m.i = 10;
		m.j = 20;
		m = change(m);
		System.out.println("i ="+m.i+", j ="+m.j);

	}
	
	static AAclass change(AAclass myVal) {
		int temp;
		
		temp = myVal.i;
		myVal.i = myVal.j;
		myVal.j = temp;
		
		return myVal;
		
	}
	
}
