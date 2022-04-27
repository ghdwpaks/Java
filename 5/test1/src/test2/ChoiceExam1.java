package test2;

import java.awt.*;

public class ChoiceExam1 extends Frame{
	public ChoiceExam1() {
		super("Choice Å×½ºÆ®");
		Panel p = new Panel();
		Choice ch = new Choice();
		
		ch.addItem("1");
		ch.addItem("2");
		ch.addItem("3");
		ch.addItem("4");
		
		p.add(ch);
		add(p);
		setSize(300,150);
		setLocation(100,100);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new ChoiceExam1();
	}
}
