package test2;

import java.awt.*;

public class CheckBoxExam4 extends Frame{
	public CheckBoxExam4() {
		super("üũ4�ڽ�");
		Panel p = new Panel();
		Checkbox ck1 = new Checkbox("��4��");
		Checkbox ck2 = new Checkbox("��4��");
		Checkbox ck3 = new Checkbox("��4");
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
