package test2;
import java.awt.*;
public class BorderLayoutExam2 extends Frame{
	public BorderLayoutExam2() {
		super("��2��");
		setLayout(new BorderLayout());
		Button b1 = new Button("��21ư");
		Button b2 = new Button("��22ư");
		Button b3 = new Button("��23ư");
		Button b4 = new Button("��24ư");
		Button b5 = new Button("��25ư");
		add(b1,BorderLayout.CENTER);
		add(b2,BorderLayout.NORTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.SOUTH);
		setLocation(100,100);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new BorderLayoutExam2();
	}
}
