package test2;

import java.awt.*;

public class PanelExam1 extends Frame{
	public PanelExam1() {
		super("Panel");
		Panel p = new Panel();
		p.setBackground(Color.blue);
		add(p);
		setSize(300,80);
		setVisible(true);
		
		
	}
	
	public static void main(String args[]) {
		PanelExam1 f = new PanelExam1();
	}

}
