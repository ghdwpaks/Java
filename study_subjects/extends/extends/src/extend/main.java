package extend;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class person {
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