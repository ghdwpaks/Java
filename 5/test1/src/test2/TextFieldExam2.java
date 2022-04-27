package test2;
import java.awt.*;
public class TextFieldExam2 extends Frame{
	public TextFieldExam2 () {
		super("주민등록번호");
		Panel p = new Panel();
		TextField tf1 = new TextField("주민등록번호앞자리");
		TextField tf2 = new TextField();
		tf1.selectAll();
		tf2.setEchoChar('*');
		p.add(tf1);
		p.add(tf2);
		add(p);
		setLocation(100,100);
		setSize(400,100);
		setVisible(true);
		
		
	}
	public static void main(String args[]) {
		new TextFieldExam2();
	}
}
