package test2;
import java.awt.*;
public class FlowLayoutExam3 extends Frame{
	public FlowLayoutExam3() {
		setLayout(new FlowLayout());
		Button b1 = new Button("b1");
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");
		add(b1);
		add(b2);
		add(b3);
		setLocation(100,100);
		setSize(100,100);
		setVisible(true);
	}
	public static void main(String args[]) {
		new FlowLayoutExam3();
	}
}
