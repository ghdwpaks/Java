package extend;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdeveloper ghdwpaks = new Studentdeveloper();
		ghdwpaks.dev();
		ghdwpaks.stack++;
		System.out.println("ghdwpaks.stack : "+ghdwpaks.stack);
		person ghd1 = new person();
		System.out.println(ghd1.stack);
		ghd1.stack++;
		System.out.println(ghd1.stack);
		
		
	}

}

class person {
	static int stack = 0;
	void eat() {
		System.out.println("���� �Խ��ϴ�");
	}
	void slee() {
		System.out.println("���� ��ϴ�.");
	}
	
}
class Student extends person {
	void study() {
		System.out.println("���θ� �մϴ�.");
	}

}

class Studentdeveloper extends Student {
	void dev() {
		System.out.println("������ �մϴ�.");
	}
}