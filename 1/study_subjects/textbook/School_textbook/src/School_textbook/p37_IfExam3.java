package School_textbook;

public class p37_IfExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = args.length;
		if(a == 0) 
			System.out.println("����� �Ű������� �Է��ϼ���.");
		else if (a == 1) 
			System.out.println("�Էµ� ����� �Ű������� "+args[0]+"�Դϴ�.");
		else if (a == 2) 
			System.out.println("�Էµ� ����� �Ű������� "+args[0]+args[1]+"�Դϴ�.");
		else if (a == 3) 
			System.out.println("�Էµ� ����� �Ű������� "+args[0]+args[1]+args[2]+"�Դϴ�.");
		else
			System.out.println("����� �Ű������� 3�������� �Է� �����մϴ�.");
	}

}
