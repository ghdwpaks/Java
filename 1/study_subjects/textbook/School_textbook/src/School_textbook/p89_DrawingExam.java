package School_textbook;

public class p89_DrawingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle89 c = new circle89();
		c.draw();
		c.painting();
	}
	
}
class Shape89 {
	public void draw() {
		System.out.println("���� �׸���");
	}
	
}

class circle89 extends Shape89 {
	private String type = "��";
	public void draw() {
		System.out.println(type + "�׸���");
	}
	public void painting() {
		System.out.println("�� ĥ�ϱ�");
	}
}