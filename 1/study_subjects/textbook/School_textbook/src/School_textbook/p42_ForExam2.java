package School_textbook;

public class p42_ForExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even_sum = 0, odd_sum = 0;
		for (int i = 0; i <= 10; i++) {
			if( i % 2 == 0) even_sum += i;
			else odd_sum += i;
		}
		System.out.println("1���� 10������ �A�� ���� "+even_sum+"�̰�," +"Ȧ�� ���� "+odd_sum+"�Դϴ�.");
	}

}