package School_textbook;

public class p40_SwitchExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int day = 0;
		switch (a) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: case 31:  
			day = 31; break;

		case 4: case 6: case 9: case 11:  
			day = 30; break;
		}
		System.out.println(a + "월은 "+day+"일입니다.");
	}

}
