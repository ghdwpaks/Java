package test2;
import java.awt.*;
public class TextFieldExam1 extends Frame {

	public TextFieldExam1() {
		super("텍스트필드");
		Panel p = new Panel();
		TextField t1 = new TextField("주민등록번호앞자리");
		TextField t2 = new TextField(15);
		t1.selectAll();
		t2.setEchoChar('*');
		p.add(t1);
		p.add(t2);
		add(p);
		setSize(400,100);
		setVisible(true);
		
		
	}
	
	public static void main(String args[]) {
		new TextFieldExam1();
	}
	
}
