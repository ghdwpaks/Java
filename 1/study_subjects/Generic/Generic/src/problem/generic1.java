package problem;
import java.util.*;
public class generic1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleArrayList li = new SimpleArrayList();
		li.add("123");
		Object[] res = new Object[5];
		for (int i = 0; i < res.length; i++) {
			try {
				res[i] = li.get(i);
				System.out.println(res[i]);
				System.out.println(res[i].getClass().getName());
			} catch (Exception e) {
				/*
				System.out.println("������ �߻��߽��ϴ�.");
				System.out.println("��ġ�� 1�̸�");
				System.out.println("i = "+i);
				*/
			}
		}
		
		
		
		
	}

}
