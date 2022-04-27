package test2;
import java.awt.*;
public class GridLayoutExam1 extends Frame{
	public GridLayoutExam1() {
		super("그1래");
		setLayout(new GridLayout(2,3));
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
		new GridLayoutExam1();
	}

}
