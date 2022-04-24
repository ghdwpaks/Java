package test1;

import java.awt.*;
import java.awt.event.*; //[1단계]
public class OverWindowEventExam2 extends Frame{
	
	public OverWindowEventExam2(){
		super("종료 버튼을 눌러주세요.");
		setSize(300,100);
		setVisible(true);
		//[2단계] 윈도우 이벤트(addWindowListener)가 발생하면,
		// 사용자가 정의한 클래스(MyClass)를 호출한다
		addWindowListener(new MyClass());
	}
	public static void main(String[] args){
		new OverWindowEventExam2();
	}
}

//[3단계] 이벤트 핸들러(WIndowAdapter)를 상속받은 클래스를 정의한다
	class MyClass extends WindowAdapter{
	//[4단계] 필요한 메소드만 재정의한다
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}