package test2;

import java.awt.*;

public class CheckBoxExam2 extends Frame {
	public CheckBoxExam2() {
		super("체크박스형2");
		Panel p = new Panel();
		Checkbox ck1 = new Checkbox("사2과");
		Checkbox ck2 = new Checkbox("딸2기",true);
		Checkbox ck3 = new Checkbox("배2");
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		
		add(p);
		setSize(400,100);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new CheckBoxExam2();
	}
	
}
