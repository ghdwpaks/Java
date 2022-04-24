package test1;

import java.awt.*;
public class FrameExam2 extends Frame //상속받음
{
	public FrameExam2() {
		super("제목"); //타이틀 생성
		setLocation(500,200);
		setSize(350,100);
		setVisible(true);
	}
	public static void main(String args[]) {
		FrameExam2 f =new FrameExam2(); //상속받은 클래스 호출
	}
}