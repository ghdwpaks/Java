package test1;

import java.awt.*;
import java.awt.event.*; // [1단계]
// [2단계] 이벤트 발생 객체(버튼)와 관련 이벤트 클래스(ActionListener)의 종류를 선택한다
public class ActionEventExam extends Frame implements ActionListener{
	//b1과 p 컴포넌트를 모든 메소드에서 공유하기 위해서 위에 선언함
	Button b1=new Button("버튼");
	Panel p = new Panel();
	public ActionEventExam(){
		super("ActionEvent");
		p.add(b1);
		add(p);
		setSize(300,150);
		setVisible(true);
		//[3단계] 이벤트 발생 객체(b1)에 이벤트 핸들러(addActionListener)를 연결한다
		b1.addActionListener(this);
	}
	//[4단계] actionPerformed 메소드에 이벤트의 기능을 구현한다
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1){ //b1이 눌리면, 창을 닫기
		System.exit(0);
		}
	}
	public static void main(String[] args){
	new ActionEventExam();
	}
}