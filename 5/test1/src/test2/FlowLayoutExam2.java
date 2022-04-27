package test2;
import java.awt.*;

public class FlowLayoutExam2 extends Frame {
	public FlowLayoutExam2() {
		super("วร2ทน");
		setLayout(new FlowLayout());
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		add(b1);
		add(b2);
		add(b3);
		setLocation(100,100);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new FlowLayoutExam2();
	}
}
