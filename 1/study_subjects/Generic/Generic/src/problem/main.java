package problem;

import problem.SimpleArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleArrayList list = new SimpleArrayList();
		list.add(50);
		list.add(100);
		
		int value1 = (Integer)list.get(0);
		int value2 = (Integer)list.get(1);
		
		System.out.println(value1 + "  " + value2);
		
		
	}

}
