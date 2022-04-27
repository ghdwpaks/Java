package test2;
import java.awt.*;
public class FlowLayoutExam4 extends Frame{
	public FlowLayoutExam4() {
		super("วร4ทน");
		setLayout(new FlowLayout());
		Button b1 = new Button("b1t");
		Button b2 = new Button("b2t");
		Button b3 = new Button("b3t");
		add(b1);
		add(b2);
		add(b3);
		setLocation(100,100);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new FlowLayoutExam4();
	}
}
