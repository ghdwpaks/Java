package test2;

import java.awt.*;


public class CheckBoxExam3 extends Frame{
	
	public CheckBoxExam3() {
		
		Panel p = new Panel();
		Checkbox ck1 = new Checkbox("사3과");
		Checkbox ck2 = new Checkbox("딸3기",true);
		Checkbox ck3 = new Checkbox("배3");
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		add(p); // 주의
		setLocation(200,500);
		setSize(300,200);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String args[]) {
		new CheckBoxExam3();
	}
	
}
