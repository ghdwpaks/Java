package test2;
import java.awt.*;
public class BorderLayoutExam1 extends Frame {
	public BorderLayoutExam1( ) {
		super("볼1레");
		setLayout(new BorderLayout());
		Button b1 = new Button("위");
		Button b2 = new Button("아래");
		Button b3 = new Button("왼쪽");
		Button b4 = new Button("가운데");
		Button b5 = new Button("오른쪽");
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.WEST);
		add(b4, BorderLayout.CENTER);
		add(b5, BorderLayout.EAST);
		setLocation(100,100);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new BorderLayoutExam1();
	}
}
