package test2;

import java.awt.*;

public class CheckBoxExam2 extends Frame {
	public CheckBoxExam2() {
		super("üũ�ڽ���2");
		Panel p = new Panel();
		Checkbox ck1 = new Checkbox("��2��");
		Checkbox ck2 = new Checkbox("��2��",true);
		Checkbox ck3 = new Checkbox("��2");
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
