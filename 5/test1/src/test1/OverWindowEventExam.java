package test1;

import java.awt.*
;
import java.awt.event.*
; //[1단계]
//[2단계] 이벤트 발생 객체(윈도우)와 관련 이벤트 클래스(WindowListener)의 종류를 선택한다.
public class OverWindowEventExam extends Frame implements WindowListener{
	public OverWindowEventExam(){
		super("종료 버튼을 눌러주세요.");
		setSize(300,100);
		setVisible(true);
		//[3단계] 현재 프레임(this)에 이벤트 핸들러(addWindowListener)를 연결한다.
		addWindowListener(this); //이벤트 연결
	}
	//[4단계] 종료 버튼이 눌려졌을 때의 이벤트의 기능을 구현한다.
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	
	public void windowClosed(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public static void main(String[] args){
	new OverWindowEventExam();
	}
}