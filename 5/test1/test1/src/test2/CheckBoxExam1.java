package test2;

import java.awt.*;
public class CheckBoxExam1 extends Frame{
	public CheckBoxExam1() {
		super("üũ�ڽ���");
		Panel p = new Panel();
		Checkbox ck1 = new Checkbox("���");
		Checkbox ck2 = new Checkbox("����");
		Checkbox ck3 = new Checkbox("Ű��");
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
