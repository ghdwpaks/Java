package test2;

import java.awt.*;
public class RadioCheckboxExam3 extends Frame{
	public RadioCheckboxExam3() {
		Panel p = new Panel();
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ck1 = new Checkbox("여3자",g,false);
		Checkbox ck2 = new Checkbox("남3자",g,true);
		p.add(ck1);
		p.add(ck2);
		add(p);
		setSize(400,100);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new RadioCheckboxExam3();
	}
}
