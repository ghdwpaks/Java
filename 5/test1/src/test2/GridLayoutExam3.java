package test2;
import java.awt.*;
public class GridLayoutExam3 extends Frame{
	public GridLayoutExam3() {
		super("��3��");
		//setLayout(GridLayout());
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
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new GridLayoutExam3();
	}
}
