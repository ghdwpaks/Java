package test2;

import java.awt.*;
public class ListExam2 extends Frame{
	
	public ListExam2() {
		super("¸®2½º2Æ®");
		Panel p = new Panel();
		List l = new List();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("65");
		l.add("7");
		l.add("8");
		p.add(l);
		add(p);
		setLocation(100,100);
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	public static void main(String args[]) {
		new ListExam2();
	}
	

}
