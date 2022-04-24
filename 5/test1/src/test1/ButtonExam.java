package test1;

import java.awt.*;
public class ButtonExam extends Frame{
	public ButtonExam(){
		super("버튼");
		Panel p=new Panel(); //2개의 버튼을 묶어줄 Panel 생성
		Button b1=new Button(); //비어 있는 버튼 객체 생성
		Button b2=new Button("버튼2"); //Label 있는 버튼 객체 생성
		b1.setLabel("버튼1"); //버튼에 Label을 넣어줌
		//Panel에 2개의 버튼 붙이기
		p.add(b1);
		p.add(b2);
		add(p); //Panel을 프레임에 추가
		setLocation(200,200);
		setSize(250,100);
		setVisible(true);
	}
	public static void main(String[] args){
		new ButtonExam();
	}
}