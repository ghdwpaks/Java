package test2;

import java.awt.*;

public class LabelExam2 extends Frame{
	
	public LabelExam2() {
		super("Label2");
		Panel p = new Panel();
		Label l1 = new Label("라벨1");
		Label l2 = new Label("라벨2",Label.CENTER);
		l1.setBackground(Color.yellow);
		l2.setBackground(Color.blue);
		p.add(l1);
		p.add(l2);
		add(p);
		setSize(300,500);
		setLocation(100,100);
		setVisible(true);
		
		
	}
	
	
	public static void main(String args[]) {
		new LabelExam2();
	}
	
}
