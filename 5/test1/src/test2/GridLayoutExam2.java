package test2;
import java.awt.*;
public class GridLayoutExam2 extends Frame{
	public GridLayoutExam2() {
		super("GridLayout");
		setLayout(new GridLayout(3,2));//배열처럼, 세로, 가로
		Button b1 = new Button("버튼1");
		Button b2 = new Button("버튼2");
		Button b3 = new Button("버튼3");
		Button b4 = new Button("버튼4");
		Button b5 = new Button("버튼5");
		Button b6 = new Button("버튼6");
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
		new GridLayoutExam2();
	}
}
