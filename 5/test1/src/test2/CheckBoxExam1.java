package test2;

import java.awt.*;
public class CheckBoxExam1 extends Frame{
	public CheckBoxExam1() {
		super("체크박스형");
		Panel p = new Panel();
		Checkbox ck1 = new Checkbox("사과");
		Checkbox ck2 = new Checkbox("딸기");
		Checkbox ck3 = new Checkbox("키위");
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		add(p);
		setSize(400,100);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new CheckBoxExam1();
	}
	
}
