package test2;
import java.awt.*;
public class BorderLayoutExam1 extends Frame {
	public BorderLayoutExam1( ) {
		super("��1��");
		setLayout(new BorderLayout());
		Button b1 = new Button("��");
		Button b2 = new Button("�Ʒ�");
		Button b3 = new Button("����");
		Button b4 = new Button("���");
		Button b5 = new Button("������");
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.WEST);
		add(b4, BorderLayout.CENTER);
		add(b5, BorderLayout.EAST);
		setLocation(100,100);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new BorderLayoutExam1();
	}
}
