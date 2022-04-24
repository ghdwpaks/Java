package test1;

import java.awt.*;
public class RadioCheckboxExam extends Frame{
	public RadioCheckboxExam(){
		super("라디오버튼형");
		Panel p=new Panel();
		//Checkbox를 그룹으로 묶음. 그룹 내에서는 하나의 항목만 선택 가능
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ra1=new Checkbox("여자",g,false);
		Checkbox ra2=new Checkbox("남자",g,true); //기본 선택 됨
		Checkbox ra3=new Checkbox("공격헬기",g,false); //기본 선택 안됨
		p.add(ra1);
		p.add(ra2);
		p.add(ra3);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args){
		new RadioCheckboxExam();
	}
}