package test2;

import java.awt.*;

public class RadioCheckboxExam4 extends Frame{
	
	public RadioCheckboxExam4() {
		super("라디오4체크박스");
		Panel p = new Panel();
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ck1 = new Checkbox("여4자",g,false);
		Checkbox ck2 = new Checkbox("남4자",g,true);
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
