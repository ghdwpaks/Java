package test2;

import java.awt.*;

public class LabelExam3 extends Frame{
	
	public LabelExam3() {
		super("��3��");
		
		Panel p = new Panel();
		Label label1 = new Label("���̺�");
		Label label2 = new Label("���̺�", Label.CENTER);
		label1.setBackground(Color.yellow);
		label2.setBackground(Color.blue);
		p.add(label1);
		p.add(label2);
		add(p);
		setSize(300,500);
		setLocation(100,100);
		setVisible(true);
		
		
	}
	
	public static void main(String args[]) {
		new LabelExam3();
	}
}
