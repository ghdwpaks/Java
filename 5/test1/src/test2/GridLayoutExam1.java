package test2;
import java.awt.*;
public class GridLayoutExam1 extends Frame{
	public GridLayoutExam1() {
		super("��1��");
		setLayout(new GridLayout(2,3));
		Button b1 = new Button("��ư1");
		Button b2 = new Button("��ư2");
		Button b3 = new Button("��ư3");
		Button b4 = new Button("��ư4");
		Button b5 = new Button("��ư5");
		Button b6 = new Button("��ư6");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		setLocation(100,100);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[]) {
		new GridLayoutExam1();
	}

}
