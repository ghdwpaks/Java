package Study;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericArrayList var1 = new GenericArrayList();
		
		var1.add(1);
		var1.add(2);
		
		int var2 = (Integer)var1.get(0);
		int var3 = (Integer)var1.get(0);
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		
	}

}
