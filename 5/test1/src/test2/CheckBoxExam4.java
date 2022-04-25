package test2;

import java.awt.*;

public class CheckBoxExam4 extends Frame{
	public CheckBoxExam4() {
		super("체크4박스");
		Panel p = new Panel();
		Checkbox ck1 = new Checkbox("사4과");
		Checkbox ck2 = new Checkbox("딸4기");
		Checkbox ck3 = new Checkbox("배4");
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		add(p);
		setSize(300,500);
		setLocation(125,200);
		setVisible(true);
		
		
	}
	
	public static void main(String args[]) {
		new CheckBoxExam4();
	}
	
}
