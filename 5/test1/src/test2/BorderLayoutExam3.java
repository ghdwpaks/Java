package test2;
import java.awt.*;
public class BorderLayoutExam3 extends Frame{
	public BorderLayoutExam3() {
		super("��3��");
		setLayout(new BorderLayout());
		Button b1 = new Button("��3ư1");
		Button b2 = new Button("��3ư2");
		Button b3 = new Button("��3ư3");
		Button b4 = new Button("��3ư4");
		Button b5 = new Button("��3ư5");
		add(b1,BorderLayout.CENTER);
		add(b2,BorderLayout.NORTH);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.EAST);
		add(b5,BorderLayout.WEST);
		setLocation(100,100);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new BorderLayoutExam3();
	}
}
