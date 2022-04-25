package test2;

import java.awt.*;
public class RadioCheckboxExam1 extends Frame{
	public RadioCheckboxExam1() {
		super("라디오버튼형");
		Panel p = new Panel();
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ra1 = new Checkbox("여자",g,false);
		Checkbox ra2 = new Checkbox("남자",g,true);
		Checkbox ra3 = new Checkbox("공격헬기",g,false);

		p.add(ra1);
		p.add(ra2);
		p.add(ra3);
		
		add(p);
		setSize(400,100);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new RadioCheckboxExam1();
	}
	
}
