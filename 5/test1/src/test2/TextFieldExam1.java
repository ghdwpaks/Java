package test2;
import java.awt.*;
public class TextFieldExam1 extends Frame {

	public TextFieldExam1() {
		super("�ؽ�Ʈ�ʵ�");
		Panel p = new Panel();
		TextField t1 = new TextField("�ֹε�Ϲ�ȣ���ڸ�");
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
