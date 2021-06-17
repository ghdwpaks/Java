package extend;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class person {
	void eat() {
		System.out.println("밥을 먹습니다");
	}
	void slee() {
		System.out.println("잠을 잡니다.");
	}
	
}
class Student extends person {
	void study() {
		System.out.println("공부를 합니다.");
	}

}

class Studentdeveloper extends Student {
	void dev() {
		System.out.println("개발을 합니다.");
	}
}