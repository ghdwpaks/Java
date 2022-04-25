package test1;

import java.awt.*;

public class FrameExam1{
	public static void main(String args[]){
		Frame f = new Frame();
		f.setTitle("제목"); //제목 생성
		f.setLocation(500,200); //모니터 안에서 프레임 출력 위치 설정
		f.setSize(350,100); //프레임 크기(가로, 세로)설정
		f.setVisible(true); //프레임을 보이게 한다
	}
}