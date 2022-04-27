package test2;
import java.awt.*;
public class BorderLayoutExam2 extends Frame{
	public BorderLayoutExam2() {
		super("볼2레");
		setLayout(new BorderLayout());
		Button b1 = new Button("버21튼");
		Button b2 = new Button("버22튼");
		Button b3 = new Button("버23튼");
		Button b4 = new Button("버24튼");
		Button b5 = new Button("버25튼");
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
