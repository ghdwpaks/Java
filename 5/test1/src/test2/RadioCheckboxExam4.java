package test2;

import java.awt.*;

public class RadioCheckboxExam4 extends Frame{
	
	public RadioCheckboxExam4() {
		super("����4üũ�ڽ�");
		Panel p = new Panel();
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ck1 = new Checkbox("��4��",g,false);
		Checkbox ck2 = new Checkbox("��4��",g,true);
		p.add(ck1);
		p.add(ck2);
		add(p);
		setLocation(200,300);
		setVisible(true);
		
		
		
	}
	
	
	public static void main(String[] args) {
		new RadioCheckboxExam4();
	}
	
	
}
