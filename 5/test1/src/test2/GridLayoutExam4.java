package test2;
import java.awt.*;
public class GridLayoutExam4 extends Frame {
	public GridLayoutExam4() {
		super("그4레");
		setLayout(new GridLayout(3,2));//3행 2열
		Button b1 = new Button("버1튼");
		Button b2 = new Button("버2튼");
		Button b3 = new Button("버3튼");
		Button b4 = new Button("버4튼");
		Button b5 = new Button("버5튼");
		Button b6 = new Button("버6튼");
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
