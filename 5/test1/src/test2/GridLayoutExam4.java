package test2;
import java.awt.*;
public class GridLayoutExam4 extends Frame {
	public GridLayoutExam4() {
		super("��4��");
		setLayout(new GridLayout(3,2));//3�� 2��
		Button b1 = new Button("��1ư");
		Button b2 = new Button("��2ư");
		Button b3 = new Button("��3ư");
		Button b4 = new Button("��4ư");
		Button b5 = new Button("��5ư");
		Button b6 = new Button("��6ư");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		setSize(200,200);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String args[]) {
		new GridLayoutExam4();
	}
}
